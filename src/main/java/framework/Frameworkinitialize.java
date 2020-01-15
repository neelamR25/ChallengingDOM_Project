package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkinitialize extends ConfigReader {

    public static WebDriver driver;

    public void InitializeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void WebURL()
    {
        driver.get(ConfigReader.AppUrl());
    }



}

