import Tarefas.Tarefa;
import Tarefas.TaskList;

public class Main {
    public static void main(String[] args) {
        TaskList lista = new TaskList();
        Tarefa ta3 = new Tarefa("varrer casa");

        lista.adicionarTarefa("passear com cachorro");
        lista.adicionarTarefa("tirar lixo");
        lista.adicionarTarefa("varrer casa");


        lista.displayTarefas();

        lista.removerTarefa(ta3.getDescricao());

        lista.displayTarefas();

    }
    
}
