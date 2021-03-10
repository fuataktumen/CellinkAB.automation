package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DashBoardPage;
import pages.Nozzles;
import pages.OnlineStore;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class OnlineStoreDefinations {

    @Given("User should be able to access to {string} module - {string} submodel")
    public void user_should_be_able_to_access_to_module_submodel(String string, String string2) {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(5);
        DashBoardPage dashBoardPage= new DashBoardPage();

        dashBoardPage.Cookes.click();
        dashBoardPage.navigateToModule("Products", "Online store");
    }
    @When("User should be able to select a category which name is {string}")
    public void user_should_be_able_to_select_a_category_which_name_is(String Noozles) {

        OnlineStore onlineStore = new OnlineStore();
        Select select = new Select(onlineStore.DropdownCategory);
        select.selectByVisibleText(Noozles);


    }
    @Then("User should be able to see {string} and {string}")
    public void user_should_be_able_to_see_and(String name, String price) {
        name="Sterile high-precision conical bioprinting nozzles, 50 pieces";
        price="$69.00";
        Nozzles nozzles= new Nozzles();
        Assert.assertEquals(name,nozzles.SterileHighPrecisionConicalBioprintingNozzles50Pieces.getText());
        Assert.assertEquals(price,nozzles.PriceSterileHighPrecisionConicalBioprintingNozzles50Pieces.getText());

    }
    @When("User should be able to select a sorting which name is {string}")
    public void user_should_be_able_to_select_a_sorting_which_name_is(String orderBy) {
        orderBy="Sort by popularity";
        OnlineStore onlineStore=new OnlineStore();

        Select select = new Select(onlineStore.Sorting);

        select.selectByVisibleText(orderBy);


    }
    @Then("User should be able to see first result is {string} and {string}")
    public void user_should_be_able_to_see_first_result_is_and(String product, String price) {
    product="Sterile standard conical bioprinting nozzles, 50 pieces";
    price="$39.00";

    OnlineStore onlineStore = new OnlineStore();
    Assert.assertEquals(product,onlineStore.Sterilestandardconicalbioprintingnozzles50pieces.getText());
    Assert.assertEquals(price,onlineStore.PriceSterilestandardconicalbioprintingnozzles50pieces.getText());




    }
}
