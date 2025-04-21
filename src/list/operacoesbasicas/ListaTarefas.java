package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefaslist;

    public ListaTarefas() {
        this.tarefaslist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaslist.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefaspararemover = new ArrayList<>();
        for(Tarefas t : tarefaslist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaspararemover.add(t);
            }

        }
        tarefaslist.removeAll(tarefaspararemover);
    }
    public int obterNumeroTotalTarefas(){
        return  tarefaslist.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaslist);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de tarefas é: "+listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Organizar");
        listaTarefas.adicionarTarefa("Vender");
        listaTarefas.adicionarTarefa("Divulgar");
        listaTarefas.adicionarTarefa("Prestigiar");
        listaTarefas.adicionarTarefa("Prestigiar");
        System.out.println("O número total de tarefas é: "+listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Prestigiar");
        System.out.println("O número total de tarefas é: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
