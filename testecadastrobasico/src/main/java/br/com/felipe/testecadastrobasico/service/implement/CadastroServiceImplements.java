package br.com.felipe.testecadastrobasico.service.implement;

import br.com.felipe.testecadastrobasico.repository.CadastroRepository;
import br.com.felipe.testecadastrobasico.service.CadastroService;
import br.com.felipe.testecadastrobasico.service.exception.CadastroException;

public class CadastroServiceImplements implements CadastroService{
	private CadastroRepository cadastroRepository;

	public CadastroServiceImplements(CadastroRepository cadastroRepository) {
		super();
		this.cadastroRepository = cadastroRepository;
	}

	@Override
	public void validaUsuario(String nome) {
		
		if(cadastroRepository.existsByNome(nome)) {
			throw new CadastroException("Usuario ja cadastrado");
		}
	}
	
}
