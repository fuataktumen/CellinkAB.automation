package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DashBoardPage;
import pages.WhatisABioinkPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.security.Key;
import java.text.CollationElementIterator;

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

    @Given("User should be able to access to Product module - Bioinks, Biomaterials & Reagents - WhatisABionk?")
    public void user_should_be_able_to_access_to_product_module() {

        DashBoardPage dashBoardPage= new DashBoardPage();
        WhatisABioinkPage whatisABioinkPage=new WhatisABioinkPage();
        BrowserUtils.waitFor(5);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(dashBoardPage.Products).perform();
        BrowserUtils.waitFor(3);
        actions.moveToElement(dashBoardPage.BioinksBiomaterialsReagents).perform();
        BrowserUtils.waitFor(3);
        actions.moveToElement(whatisABioinkPage.Whatisabioink).perform();

    }


    @When("User should be able to click WhatisABionk? - Bionk Selection Guide")
    public void user_should_be_able_to_click_whatis_a_bionk_bionk_selection_guide() {

        WhatisABioinkPage whatisABioinkPage=new WhatisABioinkPage();
        whatisABioinkPage.Whatisabioink.click();
        whatisABioinkPage.BioinkSelectionGuide.click();

    }
    @Then("User should be able to click Organoids - Liver")
    public void user_should_be_able_to_click_organoids_liver() {

        WhatisABioinkPage whatisABioinkPage=new WhatisABioinkPage();

        BrowserUtils.waitFor(5);

       /* Actions actions=new Actions(Driver.get());
        BrowserUtils.waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        //SCROLL UP
        actions.sendKeys(Keys.PAGE_UP).build().perform();*/

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        //clicking using javascript
        jse.executeScript("arguments[0].click();",whatisABioinkPage.OrganoidsButton);
        BrowserUtils.waitFor(5);
        jse.executeScript("arguments[0].click();",whatisABioinkPage.LiverButton);

        // whatisABioinkPage.OrganoidsButton.click();

       // whatisABioinkPage.LiverButton.click();



    }
    @Then("User should be able to see {string}")
    public void user_should_be_able_to_see(String searchMessage) {

    searchMessage="Want more insight on which bioink to use? Just reach out to us at sales@cellink.com for help from a qualified member of our team.";


    BrowserUtils.waitFor(5);
    WhatisABioinkPage whatisABioinkPage=new WhatisABioinkPage();


        Assert.assertEquals(whatisABioinkPage.SearchMessage.getText(),searchMessage);

        System.out.println(whatisABioinkPage.SearchMessage.getText());

    }

}
