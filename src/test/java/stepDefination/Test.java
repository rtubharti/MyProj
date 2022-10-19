package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	
	/*Given: I am manual tester
	When: I apply for new job
	Then: I get less pay
	And: I am not satisfied with my salary
	But: My Parents are sastisfied*/
	
	@Given("^I am manual tester$")
	public void IAmManualTester()
	{
		System.out.println("I am manual tester");
	}
	
	@When("^I apply for new job$")
	public void IApplyForNewJob()
	{
		System.out.println("I apply for new job");
	}
	
	@Then("^I get less pay$")
	public void IGetLessPay()
	{
		System.out.println("I get less pay");
	}
	
	@And("^I am not satisfied with my salary$")
	public void IAmNotSatisfiedWithMySalary()
	{
		System.out.println("I am not satisfied with my salary");
	}
	
	@But("^My Parents are sastisfied$")
	public void MyParentsAreSastisfied()
	{
		System.out.println("My Parents are sastisfied");
	}
}
