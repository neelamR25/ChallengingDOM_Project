package Steps;

import Pages.WebApplication;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.BasePage;
import framework.ConfigReader;
import framework.Frameworkinitialize;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandPage extends BasePage {
    @Given("I am on application URL")
    public void iAmOnApplicationURL() {
        Frameworkinitialize.WebURL();
    }

    @Then("Verify the web page header")
    public void verifyTheWebPageHeader() {
        String ActualHeader = GetInstance(WebApplication.class).verifyHeader();
        Assert.assertEquals(ConfigReader.PageHeader(), ActualHeader);
    }

    @Then("Verify the web page application URL")
    public void verifyTheWebPageApplicationURL() {
        String ActualURL = GetInstance(WebApplication.class).verifyURL();
        Assert.assertEquals(ConfigReader.AppUrl(),ActualURL);
    }

    @Then("Verify all coloured button are display and enable")
    public void verifyAllColouredButtonAreDisplayAndEnable() {
        GetInstance(WebApplication.class).blueButtonEnable();
        GetInstance(WebApplication.class).redButtonEnable();
        GetInstance(WebApplication.class).greenButtonEnable();
    }

    @Then("Verify the Elemental Selenium link is working")
    public void verifyTheElementalSeleniumLinkIsWorking() {
        String ActualElementalURL = GetInstance(WebApplication.class).verifySeleniumLink();
        Assert.assertEquals(ConfigReader.ElementalUrl(), ActualElementalURL);
    }

    @Then("Verify  no of images on web page")
    public void verifyNoOfImagesOnWebPage() {
        Integer NoOfActualImage =  GetInstance(WebApplication.class).verifyImage();
        Assert.assertEquals(ConfigReader.ImageCount(),NoOfActualImage);
    }

    @Then("Verify text of image")
    public void verifyTextOfImage() {
        String ActualText = GetInstance(WebApplication.class).verifyImageText();
        Assert.assertEquals(ConfigReader.Text(),ActualText);
    }

    @Then("Verify navigation to GitHub URL when click on Image link")
    public void verifyNavigationToGitHubURLWhenClickOnImageLink() {
        String ActualGitHubURL = GetInstance(WebApplication.class).verifyGitHubURL();
        Assert.assertEquals(ConfigReader.GitHubLinkURL(),ActualGitHubURL);
    }


    @Then("Print header of Web table")
    public void printHeaderOfWebTable() {
       GetInstance(WebApplication.class).printHeader();

    }

    @Then("Print no of row in Web Table")
    public void printNoOfRowInWebTable() {
     GetInstance(WebApplication.class).NoOfRows();
    }

    @Then("Print no of column in Web Table")
    public void printNoOfColumnInWebTable() {
        GetInstance(WebApplication.class).NoOfColumn();
    }

    @Then("I have {string} then find specific column value of particular row")
    public void iHaveThenFindSpecificColumnValueOfParticularRow(String CellValue) {
        String ActualColumnText =  GetInstance(WebApplication.class).FindSpecificColumnValue(CellValue);
        Assert.assertEquals(ConfigReader.SpecificText(),ActualColumnText);
    }

    /*@Then("Find specific column value of particular row")
    public void findSpecificColumnValueOfParticularRow() {
        String ActualColumnText =  GetInstance(WebApplication.class).FindSpecificColumnValue();
        Assert.assertEquals(ConfigReader.SpecificText(),ActualColumnText);
    }*/

    @Then("Print last row of Web table")
    public void printLastRowOfWebTable() {
        GetInstance(WebApplication.class).printLastRow();
    }

    @Then("Print cell value of specific column of specific row")
    public void printCellValueOfSpecificColumnOfSpecificRow() {
        String ActualCellText =  GetInstance(WebApplication.class).SpecificCellValueOfRow();
        Assert.assertEquals(ConfigReader.SpecificCellText(),ActualCellText);
    }

    @Then("Print any column of Web table")
    public void printAnyColumnOfWebTable() {
        GetInstance(WebApplication.class).printColumn();
    }

    @Then("print all data of table")
    public void printAllDataOfTable() {
        GetInstance(WebApplication.class).allData();
    }

    @Then("print cell index of column value")
    public void printCellIndexOfColumnValue() {
        GetInstance(WebApplication.class).CellIndex();
    }

    @Then("Click on edit link in any row of table")
    public void clickOnEditLinkInAnyRowOfTable() {
        GetInstance(WebApplication.class).clickEditLink();
    }

    @Then("Validate the URL")
    public void validateTheURL() {
        String ActualEditURL = GetInstance(WebApplication.class).editURL();
        Assert.assertEquals(ConfigReader.editClickURL(),ActualEditURL);
    }

    @Then("Click on delete link in any row of table")
    public void clickOnDeleteLinkInAnyRowOfTable() {
        GetInstance(WebApplication.class).clickDeleteLink();
    }

    @Then("Validate the delete URL")
    public void validateTheDeleteURL() {
        String ActualDeleteURL = GetInstance(WebApplication.class).deleteURL();
        Assert.assertEquals(ConfigReader.deleteClickURL(),ActualDeleteURL);
    }

    @Then("Click on the Blue colour button and validate the new image text displayed")
    public void clickOnTheBlueColourButtonAndValidateTheNewImageTextDisplayed() {
        String BeforeClickText = GetInstance(WebApplication.class).getCanavasElementText();
        GetInstance(WebApplication.class).clickBlueButton();
        String AfterClickText = GetInstance(WebApplication.class).getCanavasElementText();
        Assert.assertNotEquals(BeforeClickText,AfterClickText);
    }


    @Then("Click on the Red colour button and validate the new image text displayed")
    public void clickOnTheRedColourButtonAndValidateTheNewImageTextDisplayed() {
        String BeforeClickText = GetInstance(WebApplication.class).getCanavasElementText();
        GetInstance(WebApplication.class).clickRedButton();
        String AfterClickText = GetInstance(WebApplication.class).getCanavasElementText();
        Assert.assertNotEquals(BeforeClickText,AfterClickText);
    }

    @Then("Click on the Green colour button and validate the new image text displayed")
    public void clickOnTheGreenColourButtonAndValidateTheNewImageTextDisplayed() {
        String BeforeClickText = GetInstance(WebApplication.class).getCanavasElementText();
        GetInstance(WebApplication.class).clickGreenButton();
        String AfterClickText = GetInstance(WebApplication.class).getCanavasElementText();
        Assert.assertNotEquals(BeforeClickText,AfterClickText);
    }
}

