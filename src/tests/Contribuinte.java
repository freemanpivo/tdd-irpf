package tests;

public class Contribuinte {
	private String nome, cpf;
	
	Rendimento[] rends;
	
	public Contribuinte (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public static Contribuinte obterContribuinte(String nome, String cpf) {
		return new Contribuinte(nome,cpf);
	}

	public int getQtdTotalRendimentos() {
		return rends.length;
	}

	public float getValorTotalRendimentos() {
		float resposta = 0f;
		for (Rendimento r : rends) { 
			if (!r.ehIsento()) {
				resposta += r.getValor();
			}
		}
		return resposta;
	}

	public boolean cadastrarRendimento(Rendimento r) {
		
		boolean resposta = false;
		if (rends == null) {
			rends = new Rendimento[0];
		}
		
		int qtdeElementos = rends.length; 
		int novaQtdeElementos = qtdeElementos + 1; 
		Rendimento[] newRends = new Rendimento[novaQtdeElementos];
		
		
		for (int i=0; i<rends.length; i++) {
			newRends[i] = rends[i];
		}
		
		if (newRends[qtdeElementos] == null) {
			newRends[qtdeElementos] = r;
			rends = newRends;
			resposta = true;
		}
		return resposta;
	}

	
}
