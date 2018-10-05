package com.rafamagalhas.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.rafamagalhas.cursomc.domain.Produto;;

@Repository
public interface ProdutoRepository extends CrudRepository <Produto, Integer> {
	

}
