package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Nozzles extends BasePage {

    @FindBy(xpath= "(//h2[@class='woocommerce-loop-product__title'])[2]")
    public WebElement SterileHighPrecisionConicalBioprintingNozzles50Pieces;

    @FindBy(xpath= "(//span[@class='woocommerce-Price-amount amount'])[2]")
    public WebElement PriceSterileHighPrecisionConicalBioprintingNozzles50Pieces;

    
}
