package homework3;

import java.util.Arrays;

import javax.swing.JOptionPane;

import homework3.exception.FullGroupException;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Ivan", "Pivanov", Gender.MALE, 18, 121, "Group1");
		Student student2 = new Student("Olga", "Ivanova", Gender.FEMALE, 19, 122, "Group1");
		Student student3 = new Student("Petya", "Petrov", Gender.MALE, 19, 123, "Group1");
		Student student4 = new Student("Alica", "Patrova", Gender.FEMALE, 18, 124, "Group1");
		Student student5 = new Student("Vasiliy", "Sidorov", Gender.MALE, 20, 125, "Group1");
		Student student6 = new Student("Anna", "Sidorova", Gender.FEMALE, 21, 126, "Group1");
		Student student7 = new Student("Andrey", "Schevchenko", Gender.MALE, 19, 127, "Group1");
		Student student8 = new Student("Nastya", "Schulga", Gender.FEMALE, 18, 128, "Group1");
		Student student9 = new Student("Evgeniy", "Onegin", Gender.MALE, 20, 129, "Group1");
		Student student10 = new Student("Anton", "Larin", Gender.MALE, 21, 130, "Group1");
		
		Group group = new Group();
		group.setGroupName("course1");

		try {
			group.addStudent(student1);
			group.addStudent(student2);
			group.addStudent(student3);
			group.addStudent(student4);
			group.addStudent(student5);
			group.addStudent(student6);
			group.addStudent(student7);
			group.addStudent(student8);
			group.addStudent(student9);
			group.addStudent(group.createStudent());
//			group.addStudent(student11);
		} catch (FullGroupException e) {
			e.printStackTrace();
		}
//		group.deleteStudent(121);

		System.out.println(group.searchStudent("Ivanov"));
		System.out.println(group.searchStudent("Abrakadabra"));
		
		group.sortGroup();
		System.out.println();
		for (Student recruter : group.getReacruter()) {
			System.out.println(recruter);
		}
	}
}
