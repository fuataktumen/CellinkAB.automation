package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DashBoardPage;

import pages.NozzlesPage;
import pages.OnlineStore;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class OnlineStoreDefinations {

    @Given("User should be able to access to {string} module - {string} submodel")
    public void user_should_be_able_to_access_to_module_submodel(String string, String string2) {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(5);
        DashBoardPage dashBoardPage = new DashBoardPage();

        dashBoardPage.Cookes.click();
        BrowserUtils.waitFor(5);
        dashBoardPage.navigateToModule("Products", "Online store");
        BrowserUtils.waitFor(5);
    }

    @When("User should be able to select a category which name is {string}")
    public void user_should_be_able_to_select_a_category_which_name_is(String Noozles) {

        OnlineStore onlineStore = new OnlineStore();
        Select select = new Select(onlineStore.DropdownCategory);
        select.selectByVisibleText(Noozles);

        BrowserUtils.waitFor(5);
    }

    @Then("User should be able to see {string} and {string}")
    public void user_should_be_able_to_see_and(String name, String price) {
        name = "Sterile high-precision conical bioprinting nozzles, 50 pieces";
        price = "$69.00";
        NozzlesPage nozzlesPage=new NozzlesPage();
        System.out.println(nozzlesPage.Sterilehighprecisionconicalbioprintingnozzles50pieces.getText());
        System.out.println(nozzlesPage.PriceSterileHighPrecisionConicalBioprintingNozzles50Pieces.getText());
        Assert.assertEquals(name, nozzlesPage.Sterilehighprecisionconicalbioprintingnozzles50pieces.getText());
        Assert.assertEquals(price, nozzlesPage.PriceSterileHighPrecisionConicalBioprintingNozzles50Pieces.getText());
        BrowserUtils.waitFor(5);
    }

    @When("User should be able to select a sorting which name is {string}")
    public void user_should_be_able_to_select_a_sorting_which_name_is(String orderBy) {
        orderBy = "Sort by popularity";
        OnlineStore onlineStore = new OnlineStore();

        Select select = new Select(onlineStore.Sorting);

        select.selectByVisibleText(orderBy);


    }

    @Then("User should be able to see first result is {string} and {string}")
    public void user_should_be_able_to_see_first_result_is_and(String product, String price) {
        product = "Sterile standard conical bioprinting nozzles, 50 pieces";
        price = "$39.00";

        OnlineStore onlineStore = new OnlineStore();
        Assert.assertEquals(product, onlineStore.Sterilestandardconicalbioprintingnozzles50pieces.getText());
        Assert.assertEquals(price, onlineStore.PriceSterilestandardconicalbioprintingnozzles50pieces.getText());
        BrowserUtils.waitFor(5);

    }

    @When("User should be able to send {string} under the PRODUCT SEARCH;")
    public void user_should_be_able_to_send_under_the_product_search(String bion) {
        bion = "al";
        BrowserUtils.waitFor(5);
        OnlineStore onlineStore = new OnlineStore();
        BrowserUtils.waitFor(5);
        onlineStore.productSearch.sendKeys(bion);
        BrowserUtils.waitFor(5);

    }
        @Then("User should be  able to see {string} product under the Product Search")
        public void user_should_be_able_to_see_product_under_the_product_search(String underSearch) {
            underSearch="plexWell 24 Plus";
            OnlineStore onlineStore=new OnlineStore();
            List<WebElement> UnderproductSearchWithoutFirst = onlineStore.UnderproductSearchWithoutFirst;

            BrowserUtils.waitFor(5);
            System.out.println(UnderproductSearchWithoutFirst.get(2).getText());
            System.out.println(UnderproductSearchWithoutFirst.get(3).getText());

            Assert.assertEquals(UnderproductSearchWithoutFirst.get(3).getText(),underSearch);

    }

    @Then("User should be able to see {int} products")
    public void user_should_be_able_to_see_products(Integer int1) {

int1=6;
        NozzlesPage nozzlesPage=new NozzlesPage();


        System.out.println(nozzlesPage.NozzlesNumberResult.getText());




       Integer int2 =  Integer.parseInt(nozzlesPage.NozzlesNumberResult.getText().substring(12,13));

       Assert.assertEquals(int2,int1);
       Assert.assertTrue(int1.equals(int2));



    }




    @Then("User should be able to see first Nozzles product is {string}")
    public void user_should_be_able_to_see_first_nozzles_product_is(String NozzleKit) {


        NozzleKit = "Nozzle kit";

        NozzlesPage nozzlesPage= new NozzlesPage();
        nozzlesPage.Nozzlekit.getText();
        System.out.println(nozzlesPage.Nozzlekit.getText());

        Assert.assertTrue(NozzleKit.equals(nozzlesPage.Nozzlekit.getText()));



    }




    @Then("User should be able to see second Nozzles product is {string}")
    public void user_should_be_able_to_see_second_nozzles_product_is(String Sterilehighprecisionconicalbioprintingnozzles50pieces) {
        Sterilehighprecisionconicalbioprintingnozzles50pieces=
                "Sterile high-precision conical bioprinting nozzles, 50 pieces";
        NozzlesPage nozzlesPage= new NozzlesPage();
        Assert.assertTrue(Sterilehighprecisionconicalbioprintingnozzles50pieces.
                equals(nozzlesPage.Sterilehighprecisionconicalbioprintingnozzles50pieces.
                        getText()));



    }
    @Then("User should be able to see third Nozzles product is {string}")
    public void user_should_be_able_to_see_third_nozzles_product_is(String Sterilemicronprecisionconicalnozzles) {

        Sterilemicronprecisionconicalnozzles="Sterile micron precision conical nozzles";
        NozzlesPage nozzlesPage=new NozzlesPage();
        Assert.assertTrue(Sterilemicronprecisionconicalnozzles.equals(nozzlesPage.
                Sterilemicronprecisionconicalnozzles.getText()));

    }




    @Then("User should be able to see fourth Nozzles product is {string}")
    public void user_should_be_able_to_see_fourth_nozzles_product_is(String  Sterileprecisionconicalnozzles) {


        Sterileprecisionconicalnozzles="Sterile precision conical nozzles";
        NozzlesPage nozzlesPage = new NozzlesPage();
        Assert.assertTrue(Sterileprecisionconicalnozzles.equals(nozzlesPage.
                Sterileprecisionconicalnozzles.getText()));
    }




    @Then("User should be able to see fifth Nozzles product is {string}")
    public void user_should_be_able_to_see_fifth_nozzles_product_is(String Sterilestandardconicalbioprintingnozzles50pieces) {

        Sterilestandardconicalbioprintingnozzles50pieces=
                "Sterile standard conical bioprinting nozzles, 50 pieces";
        NozzlesPage nozzlesPage = new NozzlesPage();
BrowserUtils.waitFor(5);

        System.out.println(nozzlesPage.Sterilestandardconicalbioprintingnozzles50pieces
        .getText());
        Assert.assertTrue(Sterilestandardconicalbioprintingnozzles50pieces.equals(
                nozzlesPage.Sterilestandardconicalbioprintingnozzles50pieces.getText()
        ));

    }



    @Then("User should be able to see sixth Nozzles product is {string}")
    public void user_should_be_able_to_see_sixth_nozzles_product_is(String Thermoplasticnozzle) {

        Thermoplasticnozzle="Thermoplastic nozzle";
        NozzlesPage nozzlesPage = new NozzlesPage();
        Assert.assertTrue(Thermoplasticnozzle.equals(
                nozzlesPage.Thermoplasticnozzle.getText()
        ));

    }

}