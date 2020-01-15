package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.Frameworkinitialize;




public class Hooks extends Frameworkinitialize {

    @Before
    public void Initialize(){

        InitializeBrowser();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
    }

    @After
    public void TestStop(){
        driver.quit();
    }
}

