package br.ufjf.command;

import br.ufjf.interfaces.Tarefa;
import br.ufjf.model.Produto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IniciarVendasTarefa implements Tarefa {

    private Produto produto;

    @Override
    public void executar() {
        this.produto.iniciarVenda();
    }

}
