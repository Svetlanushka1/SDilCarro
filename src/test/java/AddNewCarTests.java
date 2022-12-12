import modals.Car;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Дописать позитивный и добавить негативный тест в AddNewCarTests
public class AddNewCarTests extends TestBase {
    @BeforeMethod
    public void preCondition() {
        if (app.getUser().isLogged() == false) {
            app.getUser().login();

        }
       /* if (app.getUser().isLogged() == false) {
            app.getUser()
                    .login((new User())
                            .withEmail("haifa@gmail.com")
                            .withPassword("Haifa082022$"));
            app.getUser().pause(10);
           // app.getUser().wait(By.xpath("//h2[@class='message']"));contains success

            app.getUser().clickOKButton();
        }*/

    }

    @Test
    public void addNewCarPositive() {
        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);
        Car car = Car.builder()
                .address("Tel Aviv")
                .manufacture("KIA")
                .model("Sportage")
                .year("2022")
                .fuel("Petrol")
                .seats("4")
                .carClass("5")
                .carRegNumber("100-200" + i)
                .price("150")
                .build();

        app.getCar().openCarForm();
        Assert.assertTrue(app.getCar().isCarFormPresent());
        app.getCar().fillCarForm(Car.builder()
                .address("Tel Aviv")
                .manufacture("KIA")
                .model("Sportage")
                .year("2022")
                .fuel("Petrol")
                .seats("4")
                .carClass("5")
                .carRegNumber("100-200")
                .price("150")
                .build());
        //app.getCar().click(By.xpath("//div[@class='address-data']")//input[@id='pickUpPlace']
        //app.getCar().submitCarForm();
        // Assert.assertTrue();

    }

   /* @AfterMethod
    public void postCondition() {

    }*/
}
