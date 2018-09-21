package tests;

public class Contribuinte {
	private String nome, cpf;
	
	public Contribuinte (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public static Contribuinte obterContribuinte(String nome, String cpf) {
		return new Contribuinte(nome,cpf);
	}

	public int getQtdTotalRendimentos() {
		return 1;
	}

	public float getValorTotalRendimentos() {
		return 4000.00f;
	}

	public boolean cadastrarRendimento(Rendimento r) {
		return true;
	}

	
}
