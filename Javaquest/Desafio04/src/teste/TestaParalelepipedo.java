package teste;
import org.junit.Assert;
import org.junit.Test;
import dominio.Paralelepipedo;

public class TestaParalelepipedo {
	@Test
	public void testCalculoDiagonal(){
		Paralelepipedo paralelepipedo = new Paralelepipedo(4f, 3f, 9f);
		float diagonal = paralelepipedo.calculaDiagonal();
		Assert.assertEquals(diagonal, 10.29563045501709, 0);
	}
}
