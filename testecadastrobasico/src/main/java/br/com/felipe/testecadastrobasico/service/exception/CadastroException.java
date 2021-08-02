package br.com.felipe.testecadastrobasico.service.exception;

public class CadastroException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3542980312991402386L;

	public CadastroException (String mensagem) {
		super (mensagem);
	}
}
