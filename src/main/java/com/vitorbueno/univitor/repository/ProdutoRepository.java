package com.vitorbueno.univitor.repository;

import com.vitorbueno.univitor.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}