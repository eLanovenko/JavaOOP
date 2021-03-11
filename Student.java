package homework3;

public class Student extends Human {
	private long gradeBookID;
	private String groupName;
	public Student(String firstName, String lastname, Gender gender, int age, long gradeBookID, String groupName) {
		super(firstName, lastname, gender, age);
		this.gradeBookID = gradeBookID;
		this.groupName = groupName;
	}
	public Student() {
		super();
	}
	public long getGradeBookID() {
		return gradeBookID;
	}
	public void setGradeBookID(long gradeBookID) {
		this.gradeBookID = gradeBookID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	@Override
	public String toString() {
		return "Student [gradeBookID=" + gradeBookID + ", groupName=" + groupName +" "+ super.toString();
	}
	
	
}
