package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }
    public boolean isElementVisible(By locator){
        WebDriverWait wait = new WebDriverWait(wd,5);
        WebElement elementVisible= wait.until(ExpectedConditions.visibilityOf(wd.findElement(locator)));
        return true;

    }

    public void type(By locator, String text) {
        WebElement element = wd.findElement(locator);
        //click on webElement
        element.click();
        // clear field from any text
        element.clear();
        //type to field text
        element.sendKeys(text);
    }

    public void click(By locator) {
        //click by locator
        wd.findElement(locator).click();
    }


    public void pause(int time) {
        //to postpone WebBrowser from action for a few min
        wd.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
      /*time = time *1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

    }

    //get info about new add contact:
    public String getText(By locator) {
        return wd.findElement(locator).getText();

    }

    public void clickOnLogoButton() {

        //click(By.xpath("//div[@class='header']//img[@alt='logo']"));
        //click(By.cssSelector("div[class='error ng-star-inserted'] div:nth-child(1)"));
        click(By.xpath("//a[@id='0']"));

    }

    public void clickOnSearchTab() {
        click(By.xpath("//a[@id='0']"));
    }


}





