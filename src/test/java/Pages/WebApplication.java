package Pages;


import framework.BasePage;
import framework.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static framework.Frameworkinitialize.driver;


public class WebApplication extends BasePage {
    @FindBy(xpath = "//h3[contains(text(),'Challenging DOM')]")
    private WebElement Header;
    @FindBy(xpath = "//a[@class='button']")
    private WebElement BlueButton;
    @FindBy(xpath = "//a[@class='button alert']")
    private WebElement RedButton;
    @FindBy(xpath = "//a[@class='button success']")
    private WebElement GreenButton;
    @FindBy(xpath = "//a[contains(text(),'Elemental Selenium')]")
    private WebElement BottomLink;
    @FindBy(xpath = "//div[@class='row']//a//img")
    private WebElement Image;
    @FindBy(xpath = "//summary[contains(text(),'Why GitHub?')]")
    private WebElement GitHubHeader;
    @FindBy(xpath = "//div[@class='row']//div[2]//table")
    private WebElement table;
    public Integer rows;
    public Integer column;

    public String verifyHeader(){
        waitForVisibleOf(Header);
        String header = Header.getText();
        System.out.println("Web Page Header=" + header);
        return header;
    }

    public String verifyURL(){
        waitForVisibleOf(Header);
        String URL = driver.getCurrentUrl();
        System.out.println("Web Page Application URL=" + URL);
        return URL;
    }

    public void blueButtonEnable(){
        waitForVisibleOf(Header);
        boolean Button1 = BlueButton.isDisplayed();
        boolean Button11 = BlueButton.isEnabled();
        if(Button1 && Button11){
            System.out.println("Blue button is displayed and Enabled");
        }
        else {
            System.out.println("Blue button is not displayed not Enabled");
        }
       /* boolean Button11 = BlueButton.isEnabled();
        if(Button11==true){
            System.out.println("Blue button is Enabled");
        }
        else {
            System.out.println("Blue button is not Enabled");
        }*/
    }

    public void redButtonEnable(){
        waitForVisibleOf(Header);
        boolean Button2 = RedButton.isDisplayed();
        boolean Button22 = RedButton.isEnabled();
        if(Button2 && Button22){
            System.out.println("Red button is displayed and Enabled");
        }
        else {
            System.out.println("Red button is not displayed and Enabled");
        }
    }

    public void greenButtonEnable() {
        waitForVisibleOf(Header);
        boolean Button3 = GreenButton.isDisplayed();
        boolean Button33 = GreenButton.isEnabled();
        if (Button3 && Button33) {
            System.out.println("Green button is displayed and Enabled");
        } else {
            System.out.println("Green button is not displayed and Enabled");
        }
    }

    public String verifySeleniumLink() {
        waitForVisibleOf(Header);
        scrollToBottom();
        BottomLink.click();
        windowhandle();
        String SeleniumLinkURL = driver.getCurrentUrl();
        System.out.println("Selenium Link URL=" + SeleniumLinkURL);
        return SeleniumLinkURL;
    }

    public Integer verifyImage(){
        waitForVisibleOf(Header);
        List<WebElement> img = driver.findElements(By.tagName("img"));
        System.out.println("Total No. of Image= "  +img.size());
        return img.size();
    }

    public String verifyImageText(){
        String ImageText = Image.getAttribute("alt");
        System.out.println("Text Of Image= " + ImageText);
        return ImageText;
    }

    public String verifyGitHubURL(){
        Image.click();
        waitForVisibleOf(GitHubHeader);
        String GitHubURL = driver.getCurrentUrl();
        System.out.println("GitHub Link URL=" + GitHubURL);
        return GitHubURL;
    }

    public void printHeader() {
        waitForVisibleOf(Header);
        List<WebElement> allHeadersOfTable = table.findElements(By.xpath("//div[@class='large-10 columns']//table//thead"));
        System.out.println("Headers in table are below:");
        for (WebElement header : allHeadersOfTable) {
            System.out.println(header.getText());
        }
    }

    public Integer NoOfRows(){
        waitForVisibleOf(Header);
        List<WebElement> TotalRows = table.findElements(By.xpath("//tr"));
        rows = TotalRows.size()-1;
        System.out.println("Total No of Rows in Web Table = " + rows);
        return rows;
    }

    public Integer NoOfColumn(){
        waitForVisibleOf(Header);
        List<WebElement> TotalColumn = table.findElements(By.xpath("//tr[1]//td"));
        column = TotalColumn.size();
        System.out.println("Total No of Column in Web Table = " + column);
        return column;
    }

    public String FindSpecificColumnValue(String CellValue){
        waitForVisibleOf(Header);
        WebElement ColumnValue = table.findElement(By.xpath("//td[contains(text(),'" + CellValue +"')]//ancestor::td/preceding::td[3]"));
        String ColumnText = ColumnValue.getText();
        System.out.println("Specific Column Text = " + ColumnText);
        return ColumnText;
    }

    public void printLastRow() {
        waitForVisibleOf(Header);
        List<WebElement> lastRowOfTable = table.findElements(By.xpath("//div[@class='row']//div[2]//table//tr[last()]//td"));
        System.out.println("Last Row in table are below:");
        for (WebElement lastRow : lastRowOfTable) {
            System.out.println(lastRow.getText());
        }
    }

    public String SpecificCellValueOfRow(){
        waitForVisibleOf(Header);
        WebElement CellValue = table.findElement(By.xpath("//div[@class='row']//div[2]//table//tr[2]//td[6]"));
        String CellText = CellValue.getText();
        System.out.println("Specific Column Text = " + CellText);
        return CellText;
    }

    public void printColumn() {
        waitForVisibleOf(Header);
        List<WebElement> PrintColumn = table.findElements(By.xpath("//div[@class='row']//div[2]//table//td[4]"));
        System.out.println("4th column in table are below:");
        for (WebElement Column : PrintColumn) {
            System.out.println(Column.getText());
        }
    }

    public void allData() {
        waitForVisibleOf(Header);
        System.out.println("Printing all data of Web Table: ");
        NoOfRows();
        NoOfColumn();
        for (int i = 1; i <= rows; i++) {
            List<WebElement> allColumnsInRow = driver.findElements(By.xpath("//div[@class='row']//div[2]//table//tr[" + i + "]//td"));
            for (int j = 0; j < column; j++) {
                System.out.print(allColumnsInRow.get(j).getText() + " ");
            }
            System.out.println();
        }
    }

        public void CellIndex() {
            waitForVisibleOf(Header);
            NoOfRows();
            NoOfColumn();
            for (int i = 1; i <= rows; i++) {
                List<WebElement> allColumnsInRow = driver.findElements(By.xpath("//div[@class='row']//div[2]//table//tr[" + i + "]//td"));
                for (int j = 0; j < column; j++) {
                    if (allColumnsInRow.get(j).getText().equals(ConfigReader.SpecificText())) {
                        System.out.println("Column Value : " + ConfigReader.SpecificText() + " has Row Index = " + i + " and " + "Column Index = " + (j + 1));
                    }
                }
            }
        }

        public void clickEditLink(){
        waitForVisibleOf(Header);
        table.findElement(By.xpath("//tr["+ ConfigReader.editClickOnRow()+"]//td[7]//a[1]")).click();
        }

        public String editURL(){
        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        return URL;
        }

    public void clickDeleteLink(){
        waitForVisibleOf(Header);
        table.findElement(By.xpath("//tr["+ ConfigReader.deleteClickOnRow()+"]//td[7]//a[2]")).click();
    }

    public String deleteURL(){
        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        return URL;
    }
    public String getCanavasElementText() {
        final By SCRIPT = By.tagName("script");

        List<WebElement> scripts = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(SCRIPT));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String query = "return document.getElementsByTagName(\"script\")[arguments[0]].innerHTML;";
        Pattern p = Pattern.compile("canvas.strokeText\\('Answer: \\d+'");
        Pattern p2 = Pattern.compile("\\d+");

        String number = IntStream.range(0, scripts.size())
                .mapToObj(i -> (String)js.executeScript(query, i))
                .map(string -> p.matcher(string))
                .filter(m -> m.find())
                .map(m -> p2.matcher(m.group()))
                .filter(m -> m.find())
                .map(m -> m.group())
                .findFirst()
                .orElse(null);
        System.out.println(number);
        return number;

    }

    public void clickBlueButton() {
        waitForVisibleOf(Header);
        BlueButton.click();
    }

    public void clickRedButton() {
        waitForVisibleOf(Header);
        RedButton.click();
    }
    public void clickGreenButton() {
        waitForVisibleOf(Header);
        GreenButton.click();
    }


}










