package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaSearchPracticeSteps {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia.url"));
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String name) {
        wikipediaSearchPage.search.sendKeys(name);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.searchBtn.click();

    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals("Steve Jobs", wikipediaSearchPage.mainTitle.getText());
    }
    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() {
        Assert.assertEquals("Steve Jobs", wikipediaSearchPage.imageHeader.getText());
    }
}
