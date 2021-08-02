package br.com.felipe.testecadastrobasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.testecadastrobasico.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
	boolean existsByNome(String nome);
}
