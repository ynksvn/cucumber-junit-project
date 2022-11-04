package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Netflix_StepDef {

    @Given("I like {string}")
    public void ı_like(String string) {
        System.out.println("This is from Given String Param");

    }
    @Given("I like")
    public void ı_like(List<String> movieTypes) {
        System.out.println(movieTypes);
        System.out.println("This is Given List of String DataTable");
    }
    @Given("I like below favorite movie with certain type")
    public void ı_like_below_favorite_movie_with_certain_type(Map<String, String> favoriteMovie) {

        System.out.println(favoriteMovie);
        System.out.println("favoriteMovie.get(\"actions\") = " + favoriteMovie.get("actions"));
    }


    @When("I go to homepage")
    public void ı_go_to_homepage() {

    }
    @Then("I should get right recommendation")
    public void ı_should_get_right_recommendation() {

    }




}
