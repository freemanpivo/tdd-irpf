package exceptions;

public class RendimentoException extends Exception{
	public static final String msg = "Excecao generica de rendimentos";
	
	public RendimentoException () {
		super(msg);
	}
	
	public RendimentoException (String msg) {
		super(msg);
	}
	
}
