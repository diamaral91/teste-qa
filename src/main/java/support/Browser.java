package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver getChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
