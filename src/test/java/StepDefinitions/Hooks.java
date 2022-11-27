package StepDefinitions;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void  setup(){
        Driver.getDriver();

    }

    @After
    public void tearDown(){
    }
}
