package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    WebDriver wd;
    HelperUser user;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        //wd.navigate().to("https://ilcarro.web.app/search");
        wd.navigate().to("https://ilcarro.web.app/");
        user = new HelperUser(wd);
    }
    public void stop(){
        //wd.quit();
    }

    public HelperUser getUser() {

        return user;
    }
}
