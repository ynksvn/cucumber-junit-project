package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPracticePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyPracticeStepDef {


    EtsyPracticePage etsyPracticePage = new EtsyPracticePage();

    @Given("User is on etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

    }
    @When("User sees title is as expected")
    public void user_sees_title_is_as_expected() {

        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Driver.getDriver().getTitle());
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        etsyPracticePage.search.sendKeys("Wooden Spoon");

    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPracticePage.searchBtn.click();

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));

    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String search) {
        etsyPracticePage.search.sendKeys(search);

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String mainTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(mainTitle));

    }




}
