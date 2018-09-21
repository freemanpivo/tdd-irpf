package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadastroRendimentoTests {

	@Test
	public void testaCadastroRendimento() {
		Contribuinte c = Contribuinte.obterContribuinte("Fulano", "000.111.222-33");
		Rendimento r = Rendimento.obterRendimento("Salario",4000.00f,false);
		
		assertEquals(1, c.getQtdTotalRendimentos());
		assertEquals(4000.00f,c.getValorTotalRendimentos(),0);
		
	}

}
