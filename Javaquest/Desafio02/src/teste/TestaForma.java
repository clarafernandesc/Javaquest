package teste;
import  org.junit.Assert;
import dominio.Forma;
import org.junit.Test;

public class TestaForma {
	@Test
	public void testTrianguloEquilatero(){
		Forma forma = new Forma(2.0f, 2.0f, 2.0f);
		String tipoForma = forma.verificaForma();
		Assert.assertEquals(tipoForma, "triangulo equilatero");
	}
	
	@Test
	public void testTrianguloIsosceles(){
		Forma forma = new Forma(2.0f, 2.0f, 3.0f);
		String tipoForma = forma.verificaForma();
		Assert.assertEquals(tipoForma, "triangulo isosceles");
	}
	
	@Test
	public void testTrianguloEscaleno(){
		Forma forma = new Forma(2.1f, 2.0f, 4.0f);
		String tipoForma = forma.verificaForma();
		Assert.assertEquals(tipoForma, "triangulo escaleno");
	}
	
	@Test
	public void testNaoTriangulo(){
		Forma forma = new Forma(2.1f, 2.0f, 4.1f);
		String tipoForma = forma.verificaForma();
		Assert.assertEquals(tipoForma, "não eh um triangulo");
	}
}
