package homework3;

import java.util.Arrays;

import javax.swing.JOptionPane;

import homework3.exception.FullGroupException;

public class Group implements Voencom {
	private Student[] student = new Student[10];
	private String groupName;

	public Group(Student[] student, String groupName) {
		super();
		this.student = student;
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student st) throws FullGroupException {
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				student[i] = st;
				break;
			}
			count++;
			if (count == student.length) {
				throw new FullGroupException("The group is full");

			}
		}
	}

	public void deleteStudent(long gradeBookID) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getGradeBookID() == gradeBookID) {
				student[i] = null;
				break;
			}
		}
	}

	public Student searchStudent(String lastName) {
		for (int i = 0; i < student.length; i++)
			if (student[i] != null && student[i].getLastname() == lastName) {
				return student[i];
			}
		return null;
	}

	public Student[] getReacruter() {
		int sizeArray = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getAge() > 18 && student[i].getGender() == Gender.MALE) {
				sizeArray += 1;
			}
		}
		Student[] st = new Student[sizeArray];
		int indexArray = 0;
		for (int i = 0; i < student.length; i++)
			if (student[i] != null && student[i].getAge() > 18 && student[i].getGender() == Gender.MALE) {
				st[indexArray] = student[i];
				indexArray += 1;
			}
		return st;
	}
	
	public void sortGroup() {
		Arrays.sort(student,new StudentNameComparator());
		for(Student st:student) {
			System.out.println(st);
		}
	}
	
	public Student createStudent() {
		try {
			String firstName=JOptionPane.showInputDialog("Input firstname");
			String lastname=JOptionPane.showInputDialog("Input lastname");
			Gender gender=Gender.valueOf(JOptionPane.showInputDialog("Input gender"));
			int age=Integer.valueOf(JOptionPane.showInputDialog("Input age"));
			long gradeBookID=Long.valueOf(JOptionPane.showInputDialog("Input ID gradebook"));
			String groupName=JOptionPane.showInputDialog("Input groupName");
			Student student = new Student(firstName,lastname,gender,age,gradeBookID,groupName);
			return student;
		}catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Error format");
	      } catch (NullPointerException e) {
	          JOptionPane.showMessageDialog(null, "Cancel");
	        }
		return null;
	}
	
	
	
	@Override
	public String toString() {
		return "Group [student=" + Arrays.toString(student) + ", groupName=" + groupName + "]";
	}

}
