package tests;

public class Rendimento {
	private String descricao;
	private float valor;
	private boolean isIsento;
	
	public Rendimento (String descricao, float valor, boolean isIsento) {
		this.descricao = descricao;
		this.valor = valor;
		this.isIsento = isIsento;
	}
	
	public static Rendimento obterRendimento (String descricao, float valor, boolean isIsento) {
		return new Rendimento(descricao,valor,isIsento);
	}
}
