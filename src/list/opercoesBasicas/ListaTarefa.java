package list.opercoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa>tarefasRemover = new ArrayList<>();
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefa list = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + list.obterNumeroTotalTarefas());

        list.adicionarTarefa("Tarefa 1");
        list.adicionarTarefa("Tarefa 1");
        list.adicionarTarefa("Tarefa 2");
        list.adicionarTarefa("Tarefa 3");
        list.adicionarTarefa("Tarefa 4");
        list.adicionarTarefa("Tarefa 4");
        System.out.println("O número total de elementos na lista é: " + list.obterNumeroTotalTarefas());


        list.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + list.obterNumeroTotalTarefas());

        list.obterDescricoesTarefas();
    }
}
