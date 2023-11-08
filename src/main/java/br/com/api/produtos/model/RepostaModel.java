package br.com.api.produtos.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component // Pode adicionar injeção de dependências
@Data
public class RepostaModel {

    private String mensagem;

}
