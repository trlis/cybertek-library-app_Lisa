package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;

public class BookCategoriesStepDefinitions {

    HomePage homePage = new HomePage();

    @Then("User choose categories of {string}")
    public void userChooseCategoriesOf(String booksCategories) throws InterruptedException {
        Thread.sleep(2000);
        homePage.chooseCategory(booksCategories);
        Driver.closeDriver();
    }
}
