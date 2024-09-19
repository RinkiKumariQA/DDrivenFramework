package Day5;

import org.testng.annotations.Test;

public class createNestedPOJO_Class 
{
   
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private int salary;
	private    NestedPojo_Empl_Add   address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public NestedPojo_Empl_Add getAddress() {
		return address;
	}
	public void setAddress(NestedPojo_Empl_Add address) {
		this.address = address;
	}
	
}
