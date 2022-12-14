import models.Car;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCarTests extends TestBase {
    @BeforeMethod
    public void preCondition() {
     if (app.getUser().isLogged() == false) {
            app.getUser()
                    .login();
        }
    /* if (app.getUser().isLogged() == false) {
            app.getUser()
                    .login((new User())
                            .withEmail("haifa@gmail.com")
                            .withPassword("Haifa082022$"));
            app.getUser().pause(2000);
            app.getUser().submitLogin();
            app.getUser().pause(3000);
            //app.getUser().wait(By.xpath("//h2[@class='message']").contains("success"));
            app.getUser().clickOkButton();
        }*/

    }

    @Test
    public void addNewCarPositive() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        Car car = Car.builder()
                .address("Tel Aviv")
                .make("Toyota Camry")
                .model("Sedan")
                .year("2022")
                .fuel("Hybrid")
                .seats("4")
                .carClass("luxury")
                .carRegNumber("100-200"+i)
                .price("300")
                .build();

        app.getCar().openCarForm();
        app.getUser().pause(3000);
        Assert.assertTrue(app.getCar().isCarFormPresent());
        app.getUser().pause(3000);
        app.getCar().fillCarForm(car);
        app.getUser().pause(2000);
        //app.getCar().addCarPhotos();//label[@for='photos']
        app.getCar().submitCarForm();



       /* app.getCar()
       .fillCarForm(Car.builder()
                .address("Tel Aviv")
                .make("KIA")
                .model("Sport")
                .year("2022")
                .fuel("Petrol")
                .seats("4")
                .carClass("5")
                .carRegNumber("100-200")
                .price("150")
                            .build());*/
        //app.getCar().click(By.xpath("//div[@class='address-data']")//input[@id='pickUpPlace']

    }

   // @AfterMethod

}
