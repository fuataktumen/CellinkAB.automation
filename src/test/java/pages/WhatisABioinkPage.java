package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatisABioinkPage extends BasePage {


    @FindBy(xpath= "(//a[text()='Bioink selection guide'])[1]")
    public WebElement BioinkSelectionGuide;

    @FindBy(xpath= "//input[@id='5153']/following-sibling::label")
    public WebElement OrganoidsButton;

    @FindBy(xpath= "(//input[@data-name='Liver'])[1]")
    public WebElement LiverButton;

    @FindBy(xpath= "//ul[@class='products columns-4']/div")
    public WebElement SearchMessage;



//

}
