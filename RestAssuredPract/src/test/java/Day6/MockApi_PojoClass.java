package Day6;

import java.util.Map;

public class MockApi_PojoClass
{
	private String degree;
   private String firstname;
   private String lastname;
   private String gender;
   private int  age;
   private int  salary;
   private String married ;
   public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
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
public String getMarried() {
	return married;
}
public void setMarried(String married) {
	this.married = married;
}
public String[] getHobbies() {
	return hobbies;
}
public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}
public Map<String, String> getFamilymembers() {
	return familymembers;
}
public void setFamilymembers(Map<String, String> familymembers) {
	this.familymembers = familymembers;
}
private String [] hobbies;
   private Map<String,String> familymembers;
}
