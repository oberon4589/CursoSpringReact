package br.com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.model.ProdutoModel;
import br.com.api.produtos.services.ProdutoService;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/listar")
    public Iterable<ProdutoModel> listar() { // Pega a lista de produtos em ProdutoService
        return ps.listar();
    }

    @GetMapping("/")
    public String rota() {
        return "api funcionando!";
    }

}
