package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ApplicationManager {
    WebDriver wd;
    WebDriverWait wait;
    HelperUser user;
    HelperCar car;

    public void init(){
        wd = new ChromeDriver();
        //wd.manage().window().maximize();
        wait = new WebDriverWait(wd,5);
        wd.navigate().to("https://ilcarro.web.app/");
        user = new HelperUser(wd);
        car = new HelperCar(wd);

    }

    public WebDriverWait getWait(){
        return wait;
    }
    public void stop(){
        // wd.quit();
    }

    public HelperUser getUser() {

        return user;
    }
    public HelperCar getCar(){

        return car;
    }
}
 /*
       WebDriverWait wait = new WebDriverWait(wd,5);
        //wait until webElement will be clickable:
       WebElement elementClickable = wait.until(ExpectedConditions.elementToBeClickable(wd.findElement(By.xpath(""))));
        //wait until webElement will be visible
      WebElement elementLocatedBy = wait.until(ExpectedConditions.visibilityOfElementLocated(wd.findElement(By.xpath(""))));
       elementLocatedBy.click();

        wait.until(ExpectedConditions.alertIsPresent());//return alert

        isPageCorrespondToMyExpectations = wait.until(ExpectedConditions.titleIs("Logo"));
        //util title of page is correspond to my expectations ->Trello
        //if expectation return true do something else do other thing

        isButtonClickable = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(" ")));
        WebElement buttonClickable = wait.until(ExpectedConditions.elementToBeClickable(wd.findElement(By.xpath(""))));


        isTextPresentInElement = wait.until(ExpectedConditions.textToBePresentInElement(wd.findElement('WebElement title'), "String text"));

        isButtonContainsActiveValue = wait.until(ExpectedConditions.attributeContains(
                WebElement,"String attribute","String value"));
                //attribute (By locator) name (String attribute) must contain(value)
       //ilCarro disabled button Y'alla(not active)
        wait.until(ExpectedConditions.attributeToBe(By locator,"String attribute","default value"));

        WebDriver condition = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By locator));
        waitWd.until(ExpectedConditions.elementToBeSelected(By Locator));//for checkBoxes

        wait.until(ExpectedConditions.invisibilityOfAllElements(List of WebElements));
        wait.until(ExpectedConditions.invisibilityOf(wd.findElement('WebElement title'));

        WebElement elementLocatedBy = wait.until(ExpectedConditions.visibilityOfElementLocated(By Locator));
        elementLocatedBy.getText();
        List <String> numbersEl= wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By locator, 0));
        List <String> windows = wait.until(ExpectedConditions.numberOfWindowsToBe(""));*/