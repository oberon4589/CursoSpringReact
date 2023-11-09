package br.com.api.produtos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.model.ProdutoModel;
import br.com.api.produtos.model.RespostaModel;
import br.com.api.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    @Autowired
    private RespostaModel rm;

    // Método para listar todos os produtos
    public Iterable<ProdutoModel> listar() {
        return pr.findAll();
    }

    // Método para cadastrar produtos
    public ResponseEntity<?> cadastrar(ProdutoModel pm) {

        if (pm.getNome().equals("")) {
            rm.setMensagem("Nome do produto é obrigatório");
            return new ResponseEntity<RespostaModel>(rm, HttpStatus.BAD_REQUEST);
        } else if (pm.getMarca().equals("")) {
            rm.setMensagem("Nome da marca é obrigatório!");
            return new ResponseEntity<RespostaModel>(rm, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<ProdutoModel>(pr.save(pm), HttpStatus.CREATED);
        }

    }

}
