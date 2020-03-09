package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.WaitElement;

import java.util.List;

public class HomePage {

    private WaitElement wait;

    public HomePage(WebDriver driver){
        wait = new WaitElement(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage waitSession(){
        wait.expectedVisible(tituloLabel).isDisplayed();
        return this;
    }

    public HomePage waitSimulation(){
        wait.expectedVisible(blocoSimularDiv).isDisplayed();
        return this;
    }

    public HomePage informePerfil(String perfil){
        for(WebElement element : perfilInput){
            if(element.getAttribute("value").equals(perfil)){
                element.click();
                break;
            }
        }
        return this;
    }

    public HomePage qualValorAplicar(String value){
        wait.expectedVisible(valorAplicarInput).sendKeys(value);
        return this;
    }

    public HomePage quantoPoupar(String value){
        wait.expectedVisible(valorInvestirInput).sendKeys(value);
        return this;
    }

    public HomePage quantoTempo(String tempo){
        wait.expectedVisible(tempoInput).sendKeys(tempo);
        return this;
    }

    public HomePage clickPeriodo(){
        wait.expectedVisible(tempoSelect).click();
        return this;
    }

    public HomePage selectPeriodo(String periodo){
        for(WebElement element : tempoList){
            if(element.getText().equals(periodo)){
                element.click();
                break;
            }
        }
        return this;
    }

    public HomePage clickSimular(){
        wait.expectedVisible(simularButton).click();
        return this;
    }

    public int quantidadeValorMinimo(){
        return valorMinimoLabel.size();
    }

    @FindBy(xpath = "//label[text()='Valor mínimo de 20.00']")
    private List<WebElement> valorMinimoLabel;

    @FindBy(className = "sessaoTitulo")
    private WebElement tituloLabel;

    @FindBy(className = "blocoSimular")
    private WebElement blocoSimularDiv;

    @FindBy(name = "perfil")
    private List<WebElement> perfilInput;

    @FindBy(id = "valorAplicar")
    private WebElement valorAplicarInput;

    @FindBy(id = "valorInvestir")
    private WebElement valorInvestirInput;

    @FindBy(id = "tempo")
    private WebElement tempoInput;

    @FindBy(className = "btSelect")
    private WebElement tempoSelect;

    @FindBy(css = ".listaSelect > li > a")
    private List<WebElement> tempoList;

    @FindBy(css = ".btnSimular")
    private WebElement simularButton;
}
