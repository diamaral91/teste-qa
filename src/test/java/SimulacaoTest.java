import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.SimuladorPO;
import support.TestBase;

public class SimulacaoTest extends TestBase {

    @Test
    public void simulacao(){
        new HomePage(driver).waitSession().waitSimulation()
                .informePerfil("paraVoce")
                .qualValorAplicar("100000")
                .quantoPoupar("25000")
                .clickPeriodo().selectPeriodo("Anos")
                .quantoTempo("48")
                .clickSimular();

        Assert.assertEquals(new SimuladorPO(driver).checkValor(), "R$ 13.841");
    }
}
