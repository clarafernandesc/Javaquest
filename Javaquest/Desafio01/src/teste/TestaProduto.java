package teste;
import org.junit.Assert;
import org.junit.Test;
import dominio.Produto;

public class TestaProduto {
	@Test
	public void testDinheiro(){
		Produto produto = new Produto(1, 2, 20.0, 1);
		double valorDesconto = produto.calculaDesconto();
		double valorFinal = produto.valorFinal();
		Assert.assertEquals(valorDesconto, 4.0, 0);
		Assert.assertEquals(valorFinal, 36, 0);
	}
	
	@Test
	public void testCheque(){
		Produto produto = new Produto(1, 2, 20.0, 2);
		double valorDesconto = produto.calculaDesconto();
		double valorFinal = produto.valorFinal();
		Assert.assertEquals(valorDesconto, 0.8, 0);
		Assert.assertEquals(valorFinal, 39.2, 0);
	}
	@Test
	public void testCartaoDebito(){
		Produto produto = new Produto(1, 2, 20.0, 3);
		double valorDesconto = produto.calculaDesconto();
		double valorFinal = produto.valorFinal();
		Assert.assertEquals(valorDesconto, 2.0, 0);
		Assert.assertEquals(valorFinal, 38, 0);
	}
	@Test
	public void testCartaoCredito(){
		Produto produto = new Produto(1, 2, 20.0, 4);
		double valorDesconto = produto.calculaDesconto();
		double valorFinal = produto.valorFinal();
		Assert.assertEquals(valorDesconto, 2.0, 0);
		Assert.assertEquals(valorFinal, 38, 0);
	}
}
