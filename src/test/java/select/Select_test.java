package select;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Select_test {

    private WebDriver driver;
    private MainPage mainPage;
    @BeforeClass
    public void beforeClass(){
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        mainPage.openStartPage();
    }
    @AfterClass
    public void afterClass (){
        driver.quit();
    }

    @Test
    public void step_01(){
        mainPage.openUrl("https://demoqa.com/select-menu");
        String locator = "//select[@id='oldSelectMenu']";
        Select select = new Select(mainPage.findElement("//select[@id='oldSelectMenu']"));
        select.selectByVisibleText("Purple");
        //Assert.assertTrue(mainPage.findElement(locator + "/option[1]").getText().equals("Purple"));


        mainPage.click("//div[div[text()='Select Option']]");
        mainPage.waitElementDisplayed("//div[@class=' css-2613qy-menu']",20);
        mainPage.waitElementDisplayed(locator);
        mainPage.click(locator + "//div[text()='Group 1, option 1']");
        //Assert.assertTrue();
    }
}
