package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;

public class OnlineStore extends BasePage{

    @FindBy(id="product_cat")
    public WebElement DropdownCategory;

    @FindBy(name = "orderby")
    public WebElement Sorting;

   @FindBy (xpath="(//h2[@class='woocommerce-loop-product__title'])[1]")
    public WebElement Sterilestandardconicalbioprintingnozzles50pieces;

   @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement PriceSterilestandardconicalbioprintingnozzles50pieces;

   @FindBy(css="input.product-search-field")
    public WebElement productSearch;

    @FindBy(xpath="//tr[@class='entry product ']/td[@class='product-info']/a/span")
    public List<WebElement> UnderproductSearchWithoutFirst;

    @FindBy(xpath="//tr[@class='entry product first']/td[@class='product-info']/a/span")
    public WebElement UnderproductSearchFirst;



    @FindBy(xpath= "//p[@class='woocommerce-result-count']")
    public WebElement NozzlesNumberResult;












}
