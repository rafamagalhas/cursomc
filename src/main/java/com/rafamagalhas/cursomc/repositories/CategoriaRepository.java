package com.rafamagalhas.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.rafamagalhas.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository <Categoria, Integer> {
	

}
