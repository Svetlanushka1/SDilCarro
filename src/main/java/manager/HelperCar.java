package manager;
import modals.Car;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperCar extends HelperBase{
    public HelperCar(WebDriver wd) {

        super(wd);
    }

    public void openCarForm() {
       click(By.xpath("//a[@id='1']"));
        //click(By.id("1"));
    }
    public boolean isCarFormPresent() {
        //return new WebDriverWait(wd, 10).until(ExpectedConditions.textToBePresentInElement(wd.findElement(By.xpath("//div[@class='car-card']//h1[.' Let the car work ']"))," Let the car work "));
                               // "Enter your address"));
        //div/h2 "Write some details about your car to rent it out"
        return  new WebDriverWait(wd,10).until(ExpectedConditions.textToBePresentInElement(wd.findElement(By.xpath(" //div/h2")), "Write some details about your car to rent it out"));

        // isElementPresent(By.id("pickUpPlace"))
    }

    public void fillCarForm(Car car) {
        //type(By.xpath("//input[@id='pickUpPlace']"),"Tel Aviv");
       // pause(3);
        //click(By.xpath("//div[@class='address-data']"));
       // click(By.cssSelector(".address-data"));
        type(By.xpath("//label[@for='make']"),"manufacture");
        type(By.cssSelector("label[for='model'].input-label"),"model");
        type(By.cssSelector("label[for='year']"), "2022");
        click(By.xpath("//option[@value='Petrol'])"));
        type(By.cssSelector("#seats"),"4");
        type(By.xpath("//input[@id='class']"),"5");
        type(By.xpath("//label[@for='serialNumber']"),"701-120-369");
        type(By.cssSelector("#price"),"150");

    }
    public void submitButton(){
        click(By.xpath("//button[@type='submit']"));
    }
    /*
    public void fillingLoginForm(User data) {
        type(By.xpath("//input[@id='email']"), data.getEmail());
        type(By.xpath("//input[@id='password']"), data.getPassword());
    }     */
}
