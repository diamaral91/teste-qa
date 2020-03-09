package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.WaitElement;

public class SimuladorPO {

    public WaitElement wait;

    public SimuladorPO(WebDriver driver){
        wait = new WaitElement(driver);
        PageFactory.initElements(driver, this);
    }

    public String checkValor(){
        return wait.expectedVisible(valorLabel).getText();
    }

    @FindBy(className = "valor")
    private WebElement valorLabel;
}
