package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup() {
        System.out.println("Before is executed FIRST regardless of it's placement");


        Driver.get().manage().window().maximize();

    }

    @After
    public void tearDown(){
        System.out.println("closing");
            Driver.closeDriver();

            BrowserUtils.waitFor(5);
        }



    }


