package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadastroRendimentoTests {

	@Test
	public void testaCadastroRendimento() {
		Contribuinte c = Contribuinte.obterContribuinte("Fulano", "000.111.222-33");
		Rendimento r = Rendimento.obterRendimento("Salario",4000.00f,false);
		
		boolean resposta = c.cadastrarRendimento(r);
		
		assertEquals(1, c.getQtdTotalRendimentos());
		assertEquals(4000.00f,c.getValorTotalRendimentos(),0);
		
	}
	
	@Test
	public void testaCadastroRendimento2() {
		Contribuinte c = Contribuinte.obterContribuinte("Ciclano", "111.222.333-44");
		Rendimento r = Rendimento.obterRendimento("Bolsa",200.00f,false);
		
		boolean resposta = c.cadastrarRendimento(r);
		
		assertEquals(1, c.getQtdTotalRendimentos());
		assertEquals(200.00f,c.getValorTotalRendimentos(),0);
		
	}

}
