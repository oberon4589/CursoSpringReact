package br.com.api.produtos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.produtos.model.ProdutoModel;
import br.com.api.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    // Método para listar todos os produtos
    public Iterable<ProdutoModel> listar() {
        return pr.findAll();
    }

}
