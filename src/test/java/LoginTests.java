import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void preCondition() {
        if (app.getUser().isLogged()) {
            //app.getUser().pause(3);
            app.getUser().logout();
        }

    }

    @Test
    public void loginSuccess() {
        User data = new User()
                .withEmail("haifa@gmail.com")
                .withPassword("Haifa082022$");


        app.getUser().openLoginForm();
        //app.getUser().fillingLoginForm("haifa@gmail.com","Haifa082022$" );
        app.getUser().fillingLoginForm(data);
        app.getUser().submitLogin();

        app.getUser().pause(2000);
        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//h2[@class='message']")));
        Assert.assertTrue(app.getUser().isLoggedSuccess());
        //app.getUser().click(By.xpath("//button[text()='Ok']"));


    }
/*
    @Test
    public void loginWrongEmail() {
        User data = new User()
                .withEmail("haifagmail.com")
                .withPassword("Haifa082022$");

        app.getUser().openLoginForm();
        //app.getUser().fillingLoginForm("haifa@gmail.com","Haifa082022$" );
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        Assert.assertTrue(app.getUser().getText(By.cssSelector("div[class='error'] div")).contains("It'snot look like email"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));

    }
    @Test
    public void emailNotRegistered() {
        /*User data = new User()
                .withEmail("xx@xx.com")
                .withPassword("Haifa082022$");


        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        //app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));////button[@class='positive-button ng-star-inserted']
        //element click intercepted: Element <a _ngcontent-wfh-c44="" class="navigation-link" id="0" ng-reflect-router-link="search" href="/search">...</a> is not clickable at point (341, 44). Other element would receive the click: <div class="cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing"></div>

        app.getUser().isElementPresent(By.cssSelector(".error div:first-child"));
        app.getUser().pause(3);
        Assert.assertFalse(app.getUser().isElementPresent(By.xpath("//a[@href='/logout?url=%2Fsearch']")));
        app.getUser().logoButton();*/
/*
    }
    @Test
    public void emailOnlyOneLetterAfterPoint() {
        User data = new User()
                .withEmail("haifa@gmail.c")
                .withPassword("Haifa082022$");

        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));

    }
    @Test
    public void emailOnlyOneLetterBeforePoint() {
        User data = new User()
                .withEmail("haifa@g.com")
                .withPassword("Haifa082022$");

        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));
    }




    @Test
    public void emailWithoutPoint() {
        User data = new User()
                .withEmail("haifa@gmailcom")
                .withPassword("Haifa082022$");


        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));


    }
    @Test
    public void passwordWithoutSymbol() {
        User data = new User()
                .withEmail("haifa@gmailcom")
                .withPassword("Haifa082022");


        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));


    }
    @Test
    public void tooLongPassword() {
        User data = new User()
                .withEmail("haifa@gmailcom")
                .withPassword("Haifa082022082022082022$");

        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
        app.getUser().click(By.xpath("//button[text()='Ok']"));


    }
    @Test
    public void anotherPassword() {
        User data = new User()
                .withEmail("haifa@gmailcom")
                .withPassword("Xxxxxx082022$");

        app.getUser().openLoginForm();
        app.getUser().fillingLoginForm(data);
        app.getUser().pause(3);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().getText(By.xpath("//h2[@class='message'] ")).contains("Login or Password incorrect"));
       // app.getUser().click(By.xpath("//button[text()='Ok']"));


    }*/



    @AfterMethod
    public void postCondition() {

        //app.getUser().click(By.cssSelector("div[class='mobile-header'] img[alt='logo']"));
        //app.getUser().click(By.xpath("//a[@id='0']"));
        app.getUser().pause(2000);
        app.getUser().clickOkButton();
        //app.getUser().click(By.xpath("//button[text()='Ok']"));
        //button[text()='OK']
    }
}
