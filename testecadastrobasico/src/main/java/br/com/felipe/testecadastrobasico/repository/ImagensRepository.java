package br.com.felipe.testecadastrobasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.testecadastrobasico.model.Imagens;

public interface ImagensRepository extends JpaRepository<Imagens, Long>{

}
