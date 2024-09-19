package snippet;

public class Snippet {
	
	@SecondStep
	Scenario:- Logout Valid Input
	Given User open Browser
	When User entr the url "https://practicetestautomation.com/practice-test-login/"
	And Enter username "student" and  password "Password123"
	And Click submit button
	And Click logout button
	And Close Browser
}

