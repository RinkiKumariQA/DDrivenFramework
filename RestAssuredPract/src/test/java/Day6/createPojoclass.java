package Day6;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class createPojoclass
{
	
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private int salary;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getIsmarried() {
		return Ismarried;
	}
	public void setIsmarried(String ismarried) {
		Ismarried = ismarried;
	}
	private String Ismarried;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	

}
