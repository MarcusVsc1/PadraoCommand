package br.ufjf.model;

import br.ufjf.interfaces.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Marketplace {

    private List<Tarefa> tarefas = new ArrayList<>();

    public void executarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

}
