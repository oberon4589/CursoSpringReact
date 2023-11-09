package br.com.api.produtos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mysql.cj.protocol.x.Ok;

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

    // Método para cadastrar ou alterar produtos
    public ResponseEntity<?> cadastrarAlterar(ProdutoModel pm, String action) {

        if (pm.getNome().equals("")) {
            rm.setMensagem("Nome do produto é obrigatório");
            return new ResponseEntity<RespostaModel>(rm, HttpStatus.BAD_REQUEST);
        } else if (pm.getMarca().equals("")) {
            rm.setMensagem("Nome da marca é obrigatório!");
            return new ResponseEntity<RespostaModel>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if (action.equals("cadastrar")) {
                return new ResponseEntity<ProdutoModel>(pr.save(pm), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<ProdutoModel>(pr.save(pm), HttpStatus.OK);
            }
        }

    }

    // Método para remover produtos
    public ResponseEntity<RespostaModel> remover(long codigo) {

        pr.deleteById(codigo);
        rm.setMensagem("O produto foi removido com sucesso!");
        return new ResponseEntity<RespostaModel>(rm, HttpStatus.OK);


    }

}
