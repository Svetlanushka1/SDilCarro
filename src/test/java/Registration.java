import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Registration extends TestBase {
    @Test
    public void registrationPositiveTest(){
        //int i = (int)((System.currentTimeMillis() / 1000)% 3600);
        User user = new User()
                .withName("Il")
                .withLastName("Carro")
                .withEmail("ilcarro@mail.ru")
                .withPassword("ilCarro15122022$");

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitRegistration();
        app.getUser().pause(2000);
        app.getUser().clickOkButton();//h1[@class='message'] ->Registered

    }
    @Test
    public void userAlreadyExists(){
        /*User user = new User()
                .withName("Il")
                .withLastName("Carro")
                .withEmail("ilcarro@mail.ru")
                .withPassword("ilCarro15122022$");

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitRegistration();
        app.getUser().clickOkButton();*/
        registrationPositiveTest();
        app.getUser().pause(1000);
        Assert.assertTrue(app.getUser().isRegistrationFailed());
        app.getUser().click(By.cssSelector(".positive-button.ng-star-inserted"));

    }
@Test
public void wrongEmail() {
    User user = new User()
            .withName("Il")
            .withLastName("Carro")
            .withEmail("ilcarromail.ru")
            .withPassword("ilCarro15122022$");

    app.getUser().openRegistrationForm();
    app.getUser().fillRegistrationForm(user);
    //app.getUser().pause(2000);
    app.getUser().clickOnSearchTab();
    //Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector("div[class='error ng-star-inserted'] div:nth-child(1)")));
   // Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//div[@class='error']//div[1]")));
    //app.getUser().pause(2000);


    }

    //span[@class='navigator']Click here
}
/*
Sign up
4 fields
click checkbox
submit
 */