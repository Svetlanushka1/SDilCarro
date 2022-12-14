import models.User;
import org.testng.annotations.Test;
//Добавить негативный тест в класс RegistrationTest
public class Registration extends TestBase {
    @Test
    public void registrationPositiveTest(){
        int i = (int)((System.currentTimeMillis() / 1000)% 3600);
        User user = new User()
                .withName("Julia")
                .withLastName("Roberts")
                .withEmail("name2017@")
                .withPassword("Haifa082022$");

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(user);
        app.getUser().submitRegistration();

    }


    //span[@class='navigator']Click here
}
/*
Sign up
4 fields
click checksbox
submit
 */