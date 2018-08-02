package com.capgemini.sampl1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class newclass {

	private App add = new App();
	@Given("^I give inputs (\\d+) and (\\d+)$")
	public void i_give_inputs_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  add.setNum1(arg1);
	  add.setNum2(arg2);
	}

	@When("^sum is called$")
	public void sum_is_called() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		add.sum();
	}

	@Then("^result will be (\\d+)$")
	public void result_will_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertThat(add.sum(), equalTo(30));
	}
	
}
