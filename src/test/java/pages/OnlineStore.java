package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class OnlineStore extends BasePage{

    @FindBy(id="product_cat")
    public WebElement DropdownCategory;

    @FindBy(name = "orderby")
    public WebElement Sorting;

   @FindBy (xpath="(//h2[@class='woocommerce-loop-product__title'])[1]")
    public WebElement Sterilestandardconicalbioprintingnozzles50pieces;

   @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement PriceSterilestandardconicalbioprintingnozzles50pieces;





}
