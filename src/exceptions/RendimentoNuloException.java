package exceptions;

public class RendimentoNuloException extends RendimentoException {
	public static final String msg = "O total de rendimentos eh igual a zero.";
	
	public RendimentoNuloException () {
		super(msg);
	}
	
	public RendimentoNuloException (String msg) {
		super(msg);
	}
	
}
