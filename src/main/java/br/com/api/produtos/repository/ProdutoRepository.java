package br.com.api.produtos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.model.ProdutoModel;

@Repository // Com isso o spring tem acesso que esse arquivo é um repositório
public interface ProdutoRepository extends CrudRepository<ProdutoModel, Long> {

}
