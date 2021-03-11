package homework3;

public class Human {
	private String firstName;
	private String lastname;
	private Gender gender;
	private int age;

	public Human() {
		super();
	}

	public Human(String firstName, String lastname, Gender gender, int age) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age + "]";
	}	
	
}	