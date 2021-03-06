package br.com.arsolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arsolutions.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
