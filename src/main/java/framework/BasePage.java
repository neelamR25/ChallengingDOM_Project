package framework;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static framework.Frameworkinitialize.driver;
import java.util.Iterator;
import java.util.Set;

public class BasePage {

    private final WebDriverWait wait = new WebDriverWait(driver,30);

    protected void waitForVisibleOf(WebElement element)

    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected void elementToBeClickable(WebElement element1)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element1));
    }

    protected <TPage extends BasePage> TPage GetInstance(Class<TPage> pageInstance){
        try{
            return PageFactory.initElements(driver,pageInstance);
        }
        catch (Exception e) {
            throw new RuntimeException("Error while creating new page instance", e);
        }
    }
    protected void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    protected void windowhandle(){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
    }

}

