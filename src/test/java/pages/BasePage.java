package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public abstract class BasePage {




    @FindBy(id = "adroll_allow_all")
    public WebElement Cookes;

    @FindBy(id = "menu-item-21830")
    public WebElement Products;

    @FindBy(xpath = "//li[@class='parent-item']/following-sibling ::ul//a[text()='Bioprinting']")
    public WebElement Bioprinting;

    @FindBy(xpath = "(//div[text()='BIO X™'])[2]")
    public WebElement Bıox;

    @FindBy(xpath = "(//a[text()='Bioinks, Biomaterials & Reagents'])[2]")
    public WebElement BioinksBiomaterialsReagents;

    @FindBy(xpath = "(//a[text()='Materials for bioink development'])[2]")
    public WebElement Materialsforbioinkdevelopment;

    @FindBy(xpath = "(//a[text()='Concentrated Components'])[2]")
    public WebElement ConcentratedComponents ;

    @FindBy(xpath = "(//a[text()='HAMA Lyophilizate'])[2]")
    public WebElement HAMALyophilizate ;












// //nav[@class='wmco-navigation wmco-primary-navigation']/ul//a[text()='Applications']
// //li[@class='parent-item']/following-sibling ::ul//a[text()='Bioprinting']
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//nav[@class='wmco-navigation wmco-primary-navigation']/ul//a[text()='" + tab + "']";
        String moduleLocator = "//li[@class='parent-item']/following-sibling ::ul//a[text()='" + module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }




    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
