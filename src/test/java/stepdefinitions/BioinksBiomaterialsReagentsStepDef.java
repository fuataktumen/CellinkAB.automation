package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.DashBoardPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class BioinksBiomaterialsReagentsStepDef  {

    @When("User should be able to navigate Product module - Bioinks Biomaterials Reagents - Materials for bioink development - Concentrated Components - HAMA Lyophilizate")
    public void user_should_be_able_to_navigate() {


        DashBoardPage dashBoardPage= new DashBoardPage();
        Actions actions=new Actions(Driver.get());
        BrowserUtils.waitFor(5);
        actions.moveToElement(dashBoardPage.Products).perform();
        actions.moveToElement(dashBoardPage.BioinksBiomaterialsReagents).perform();
        actions.moveToElement(dashBoardPage.Materialsforbioinkdevelopment).perform();
        actions.moveToElement(dashBoardPage.ConcentratedComponents).perform();
        actions.moveToElement(dashBoardPage.HAMALyophilizate).perform();



    }
    @Then("User should be able to click HAMA Lyophilizate product")
    public void user_should_be_able_to_click_hama_lyophilizate_product() {

        DashBoardPage dashBoardPage=new DashBoardPage();

        dashBoardPage.HAMALyophilizate.click();
    }
}
