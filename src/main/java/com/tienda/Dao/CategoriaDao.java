package com.tienda.Dao;

import com.tienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
