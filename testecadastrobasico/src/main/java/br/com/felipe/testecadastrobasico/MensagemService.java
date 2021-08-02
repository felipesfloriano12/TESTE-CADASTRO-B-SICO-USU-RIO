package br.com.felipe.testecadastrobasico;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MensagemService {

	@Value("${applcation.name}")
	private String appname;
	
}
