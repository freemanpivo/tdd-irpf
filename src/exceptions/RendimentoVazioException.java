package exceptions;

public class RendimentoVazioException extends RendimentoException {
	public static final String msg = "Rendimentos vazios! Não há rendimentos cadastrados.";
	
	public RendimentoVazioException () {
		super(msg);
	}
	
	public RendimentoVazioException (String msg) {
		super(msg);
	}

}
