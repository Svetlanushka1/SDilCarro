package manager;

import models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperCar extends HelperBase {
    public HelperCar(WebDriver wd) {

        super(wd);
    }

    public void openCarForm() {
        isElementVisible(By.xpath("//a[@id='1']"));

        //.until(ExpectedConditions.visibilityOfElementLocated()
        //click(By.xpath("//a[@id='1']")); -> [ Let the car work ] button
        click(By.id("1"));
    }

    public boolean isCarFormPresent() {
        return new WebDriverWait(wd, 5)
                .until(ExpectedConditions.textToBePresentInElement(
                        wd.findElement(By.cssSelector("#pickUpPlace")), "Enter your address"));
        //return new WebDriverWait(wd, 5).until(ExpectedConditions.textToBePresentInElement(wd.findElement(By.cssSelector(".part-label:first-child")),"Location:"));// -> Location label
        //wd.findElement(By.cssSelector("h1[class='title']"))," Let the car work "));
        //wd.findElement(By.xpath("//div[@class='car-card']//h1[.' Let the car work ']"))," Let the car work "));
        // isElementPresent(By.id("pickUpPlace")) ;  // div/h2 "Write some details about your car to rent it out"

    }

    public void typeLocation(String address) {
        type(By.id("pickUpPlace"), address);
        isElementPresent(By.cssSelector(".pac-matched:first-child"));
        //pause(3000);
        //click(By.cssSelector("div.pac-item"));//.pac-matched:first-child
        click(By.cssSelector(".pac-matched:first-child"));
        //pause(3000);

    }

    public void select(By locator, String option) {
        new Select(wd.findElement(locator)).selectByValue(option);

    }

    public void fillCarForm(Car car) {
        typeLocation(car.getAddress());

        type(By.id("make"), car.getMake());
        type(By.id("model"), car.getModel());
        type(By.id("year"), car.getYear());
        select(By.id("fuel"), car.getFuel());
        type(By.id("seats"), car.getSeats());
        type(By.id("class"), car.getCarClass());


        type(By.id("serialNumber"), car.getCarRegNumber());
        type(By.id("price"), car.getPrice());
    }

    public void submitButton() {
        click(By.xpath("//button[@type='submit']"));
    }

    public void submitCarForm() {
        click(By.xpath("//button[@type='submit']"));

    }
    /*
    public void fillingLoginForm(User data) {
        type(By.xpath("//input[@id='email']"), data.getEmail());
        type(By.xpath("//input[@id='password']"), data.getPassword());
         //input[@id='pickUpPlace']"),"Tel Aviv");
         //div[@class='address-data']"));
        //click(By.cssSelector(".address-data"));
        //div[@class='pac-container pac-logo hdpi']"));
        //label[@for='make']"),"manufacture");
        //By.cssSelector("label[for='model'].input-label"),"model");
        //By.cssSelector("label[for='year']"), "2022");
        //option[@value='Petrol'])"));
        //.cssSelector("#seats"),"4");
       //input[@id='class']"),"5");
        //label[@for='serialNumber']"),"701-120-369");
       //By.cssSelector("#price"),"150");
       // app.getUser().wait(By.xpath("//h2[@class='message']").contains("success"));
    }     */
}
