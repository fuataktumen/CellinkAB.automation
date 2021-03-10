package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class BioPrintingStepDefinations {

    @Given("User should be able to access to Web Site")
    public void user_should_be_able_to_access_to_web_site() {

    String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        DashBoardPage dashBoardPage= new DashBoardPage();
        BrowserUtils.waitFor(5);
        dashBoardPage.Cookes.click();


    }
    @When("User should be able to navigate Navigation Bars")
    public void user_should_be_able_to_navigate_navigation_bars() {

        DashBoardPage dashBoardPage= new DashBoardPage();
        BrowserUtils.waitFor(5);
        dashBoardPage.navigateToModule("Applications" , "Biofabrication");




    }
    @Then("User should be able to navigate to BioPrinting Page")
    public void user_should_be_able_to_navigate_to_bio_printing_page() {

        DashBoardPage dashBoardPage= new DashBoardPage();
        BrowserUtils.waitFor(5);
        dashBoardPage.navigateToModule("Products" , "Bioprinting");



    }

}
