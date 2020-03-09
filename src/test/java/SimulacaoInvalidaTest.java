import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.SimuladorPO;
import support.TestBase;

public class SimulacaoInvalidaTest extends TestBase {

    @Test
    public void simulacaoInvalida(){
        HomePage home = new HomePage(driver).waitSession().waitSimulation()
                .informePerfil("paraVoce")
                .qualValorAplicar("1000")
                .quantoPoupar("250")
                .clickPeriodo().selectPeriodo("Anos")
                .quantoTempo("48")
                .clickSimular();

        Assert.assertEquals(home.quantidadeValorMinimo(), 2);
    }
}
