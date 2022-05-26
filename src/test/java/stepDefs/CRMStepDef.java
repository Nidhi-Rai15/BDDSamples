package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	@Before (value = "@RegressionTest", order = 1)
	public void readFromPropWin() {
		System.out.println("Read from Property file in Windows");
	}
	@Before (value = "@RegressionTest", order = 3)
	public void initializeChromeWin() {
		System.out.println("Initialize chrome for regression test in Windows");
	}
	@Before (value = "@RegressionTest", order = 2)
	public void initializeDBWin() {
		System.out.println("DB initialization in Windows");
	}
	@Before (value = "@SmokeTest", order = 1)
	public void readFromPropMac() {
		System.out.println("Read from Property file in Mac");
	}
	@Before (value = "@SmokeTest", order = 3)
	public void initializeChromeMac() {
		System.out.println("Initialize chrome for smoke test in Mac");
	}
	@Before (value = "@SmokeTest", order = 2)
	public void initializeDBMac() {
		System.out.println("DB initialization in Mac");
	}
//	@Before ("@SmokeTest")
//	public void initializeEdge() {
//		System.out.println("Initialize Edge for smoke test");
//	}
	@Given("User must have logged in")
	public void user_must_have_logged_in() {
	    System.out.println("User must have logged in");
	}
	@When("User creates a new contact")
	public void user_creates_a_new_contact() {
		System.out.println("User creates a new contact");
	}
	
	@When("User View a contact details")
	public void user_view_a_contact_details() {
		System.out.println("User View a contact details");
	}
	
	@When("User edit a contact details")
	public void user_edit_a_contact_details() {
	    System.out.println("User edit a contact details");
	}
	
	@When("User delete a contact")
	public void user_delete_a_contact() {
	    System.out.println("User delete a contact");
	}
	
	@When("User creates a new deal")
	public void user_creates_a_new_deal() {
		System.out.println("User creates a new deal");
	}
	
	@When("User View a deal details")
	public void user_view_a_deal_details() {
		System.out.println("User View a deal details");
	}
	
	@When("User edit a deal details")
	public void user_edit_a_deal_details() {
	    System.out.println("User edit a deal details");
	}
	
	@When("User delete a deal")
	public void user_delete_a_deal() {
	    System.out.println("User delete a deal");
	}
	
	@When("User creates a new task")
	public void user_creates_a_new_task() {
		System.out.println("User creates a new task");
	}
	
	@When("User View a task details")
	public void user_view_a_task_details() {
		System.out.println("User View a task details");
	}
	
	@When("User edit a task details")
	public void user_edit_a_task_details() {
	    System.out.println("User edit a task details");
	}
	
	@When("User delete a task")
	public void user_delete_a_task() {
	    System.out.println("User delete a task");
	}
	
	@After
	public void teardown() {
		System.out.println("After each scenario");
	}






}
