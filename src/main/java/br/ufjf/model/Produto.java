package br.ufjf.model;

import lombok.Getter;

@Getter
public class Produto {

    private String descricao;
    private String disponibilidade;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public void iniciarVenda() {
        this.disponibilidade = "Produto disponível para venda.";
    }

    public void encerrarVenda() {
        this.disponibilidade = "Produto indisponível.";
    }


}
