package Day5;

import java.util.List;

public class CompNestPCl 
{
	

	private String company;
	private String street;
	private String city; 
	private String state;
	private int pincode;
	private List <String> BankAccount;
	
	
public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public List<String> getBankAccount() {
		return BankAccount;
	}


	public void setBankAccount(List<String> bankAccount) {
		BankAccount = bankAccount;
	}


	public List<createNestedPOJO_Class> getEmplist() {
		return emplist;
	}


	public void setEmplist(List<createNestedPOJO_Class> emplist) {
		this.emplist = emplist;
	}


private List<createNestedPOJO_Class> emplist;

}
