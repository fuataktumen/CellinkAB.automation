package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

        DashBoardPage dashBoardPage = new DashBoardPage();
        BrowserUtils.waitFor(5);
        dashBoardPage.navigateToModule("Products", "Bioprinting");


    }


    @When("User should be able to navigate {string} - {string} submodel {string} product")
    public void user_should_be_able_to_navigate_submodel_product(String string, String string2, String string3) {

        DashBoardPage dashBoardPage= new DashBoardPage();
        BrowserUtils.waitFor(5);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(dashBoardPage.Products).perform();
        BrowserUtils.waitFor(3);
        actions.moveToElement(dashBoardPage.Bioprinting).perform();
        actions.moveToElement(dashBoardPage.Bıox).perform();


    }
    @Then("User should be able to click BIOX product")
    public void user_should_be_able_to_click_product() {

DashBoardPage dashBoardPage=new DashBoardPage();
dashBoardPage.Bıox.click();



    }
}
