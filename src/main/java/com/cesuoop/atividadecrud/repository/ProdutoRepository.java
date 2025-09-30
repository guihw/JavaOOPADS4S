package com.cesuoop.atividadecrud.repository;

import com.cesuoop.atividadecrud.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
