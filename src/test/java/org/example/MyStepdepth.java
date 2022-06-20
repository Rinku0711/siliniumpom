package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdepth {


Homepage homepage = new Homepage();
RegistrationPage registrationPage = new RegistrationPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
      homepage.clickregistertab();
    }
    @When("I enter required registration detail")
    public void i_enter_required_registration_detail() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.UserShouldBeAbleTORegisterSuccessfully();

    }
    @When("click on Registration submit button")
    public void click_on_registration_submit_button() {
        // Write code here that turns the phrase above into concrete actions


    }
    @Then("I should be able to registered successfully")
    public void i_should_be_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions


    }


    @Given("I am on homepage")
    public void i_am_on_homepage() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I click on {string} from top menu header")
    public void i_click_on_from_top_menu_header(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnCategoryLink(category_name);

    }
    @Then("I should able to successfully navigated to related {string} category page successfully")
    public void i_should_able_to_successfully_navigated_to_related_category_page_successfully(String category_url ) {
        // Write code here that turns the phrase above into concrete actions
       Utils.verifyCurrentUrl(category_url);
    }


}
