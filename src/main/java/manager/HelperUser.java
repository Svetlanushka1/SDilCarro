package manager;

import modals.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {

        super(wd);
    }

    public void submitLogin() {

        click(By.xpath("//button[@type='submit']"));
    }
    public void submitRegistration(){
        click(By.xpath("//button[2]"));
    }

    public void clickOKButton() {

        click(By.xpath("//button[text()='Ok']"));
    }

    public boolean isLogged() {

        return isElementPresent(By.xpath("//a[text()=' Logout ']"));
    }

    public void logout() {
         click(By.xpath("//a[text()=' Logout ']"));

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



  /*  public void login() {

        String email = "haifa@gmail.com";
        String password = "Haifa082022$";
        openLoginForm();
        fillingLoginForm(email, password);
        submitLogin();
        pause(5);
        //if there is such element on the page , says True
        //  Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//button")));

    }*/

}
//Logged in //button[@type='button']