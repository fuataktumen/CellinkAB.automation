package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NozzlesPage extends BasePage {


    @FindBy(xpath = "//h2[text()='Nozzle kit']")
    public WebElement Nozzlekit;

    @FindBy(xpath = "//h2[text()='Sterile high-precision conical bioprinting nozzles, 50 pieces']")
    public WebElement Sterilehighprecisionconicalbioprintingnozzles50pieces;

    @FindBy(xpath = "//h2[text()='Sterile micron precision conical nozzles']")
    public WebElement Sterilemicronprecisionconicalnozzles;

    @FindBy(xpath = "//h2[text()='Sterile precision conical nozzles']")
    public WebElement Sterileprecisionconicalnozzles;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[2]")
    public WebElement PriceSterileHighPrecisionConicalBioprintingNozzles50Pieces;

    @FindBy(xpath = "//h2[text()='Thermoplastic nozzle']")
    public WebElement Thermoplasticnozzle;

    @FindBy(xpath = "//h2[text()='Sterile standard conical bioprinting nozzles, 50 pieces']")
    public WebElement Sterilestandardconicalbioprintingnozzles50pieces;


    @FindBy(xpath= "//p[@class='woocommerce-result-count']")
    public WebElement NozzlesNumberResult;


}
