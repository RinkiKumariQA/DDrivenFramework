package Day6;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"gender","age"})
public class Emp_Ig_PojoClass {
	

	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private int salary;
	
//	@JsonIgnore
	private String fullname;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
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
