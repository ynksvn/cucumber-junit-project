package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPracticePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartBearPracticeSteps {

    SmartBearPracticePage smartBearPracticePage = new SmartBearPracticePage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("smartBear.url"));
        smartBearPracticePage.username.sendKeys(ConfigurationReader.getProperty("username"));
        smartBearPracticePage.password.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {


    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {


    }
    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {


    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {


    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {


    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {


    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {


    }
    @When("User enters {string}")
    public void user_enters(String string) {


    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {


    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {


    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {


    }
    @When("User clicks process button")
    public void user_clicks_process_button() {


    }
    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {

    }

}
