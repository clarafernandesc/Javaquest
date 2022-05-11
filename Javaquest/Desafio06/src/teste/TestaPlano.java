package teste;
import org.junit.Assert;
import org.junit.Test;
import dominio.Plano;

public class TestaPlano {
	@Test
	public void testCalculoDistancia(){
		Plano plano = new Plano(14.0f, 22.0f, 20.0f, 30.0f);
		float distancia = plano.calculaDistancia();
		Assert.assertEquals(distancia, 10, 0);
	}
}