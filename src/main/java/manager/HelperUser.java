package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void login() {
        openLoginForm();
        fillingLoginForm("haifa@gmail.com", "Haifa082022$");
        submitLogin();
        pause(2000);
        Assert.assertTrue(isElementPresent(By.xpath("//h2[@class='message']")));
        click(By.xpath("//button[text()='Ok']"));

    }

    public void login(User user) {

        openLoginForm();
        fillingLoginForm(user);
        submitLogin();
        pause(2000);
        Assert.assertTrue(isLoggedSuccess());
        clickOkButton();

    }

    public void submitLogin() {

        click(By.xpath("//button[@type='submit']"));
    }



    public void clickOkButton() {
         click(By.xpath("//button[text()='Ok']")); //button[@type='button']
      //  click(By.xpath("//button[@type='button']"));
    }
    public void submitRegistration() {
        click(By.xpath("//button[@type='button']"));
                //button[2]"));
    }

    public boolean isLogged() {
        return isElementPresent(By.xpath("//a[text()=' Logout ']"));
    }

    public boolean isLoggedSuccess() {
        WebDriverWait wait = new WebDriverWait(wd, 10);
        //During 10 sec we will be waiting is this element with such attributes present
        //WebElement element = wd.findElement(By.xpath("//h2[@class='message']"));  //h2[text()='Logged in success']"
        //WebElement element = wd.findElement(By.xpath("//a[@href='/logout?url=%2Fsearch']"));
        WebElement element = wd.findElement(By.cssSelector(".dialog-container"));
        wait.until(ExpectedConditions.visibilityOf(element));
        //a[@href='/logout?url=%2Fsearch'] -> button logout
        System.out.println(element.getText());
        //return element.getText().contains("Logout");
        return wd.findElement(
                By.cssSelector(".dialog-container")).getText().contains("success");
    }

    public void logout() {
        click(By.xpath("//a[text()=' Logout ']"));
        //css a[href$='/logout?url=%2Fsearch']
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }

    public void fillingLoginForm(String email, String password) {
        type(By.xpath("//input[@id='email']"), email);
        type(By.xpath("//input[@id='password']"), password);
    }

    public void fillingLoginForm(User data) {
        type(By.xpath("//input[@id='email']"), data.getEmail());
        type(By.xpath("//input[@id='password']"), data.getPassword());
    }




    public void fillRegistrationForm(User user) {

        type(By.id("name"), user.getName());
        type(By.id("lastName"), user.getLastName());
        type(By.id("email"), user.getEmail());
        type(By.id("name"), user.getPassword());
        click(By.cssSelector(""));
    }

    public void openRegistrationForm() {
        click(By.xpath("//a[text()=' Sign up ']"));
    }
}
