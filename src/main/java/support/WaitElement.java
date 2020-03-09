package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {

    private WebDriver driver;

    public WaitElement(WebDriver driver){
        this.driver = driver;
    }

    public WebElement expectedVisible(WebElement element){
        try {
            return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
        } catch (WebDriverException e) {
            return element;
        }
    }
}
