package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup() {
        System.out.println("Before is executed FIRST regardless of it's placement");


        Driver.get().manage().window().maximize();

    }

    @After
    public void cleanUp()
    {
        System.out.println("After is executed at LAST regardless of it's placement");


    }
}
