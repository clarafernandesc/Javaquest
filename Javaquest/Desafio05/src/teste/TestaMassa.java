package teste;
import org.junit.Assert;
import org.junit.Test;
import dominio.Massa;

public class TestaMassa {
	@Test
	public void testMassaETempo(){
		Massa massa = new Massa(50);
		massa.calculaTempo();
		int tempo = massa.getTempo();
		float massaFinal = massa.getMassaFinal();
		Assert.assertEquals(350, tempo, 0);
		Assert.assertEquals(0.390625, massaFinal, 0);
	}
}
