package Tarefas;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Tarefa> tarefas;

    public TaskList()
    {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao)
    {
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
    }

    public void removerTarefa(String descricao)
    {

        if (!this.tarefas.isEmpty())
        {
            for(Tarefa tasks: tarefas)
                {
                    if(tasks.getDescricao().equals(descricao))
                    {
                        System.out.println("Tarefa removida : " + tasks.getDescricao());
                        this.tarefas.remove(tasks);
                        return;
                    }
                    
                }
        }else
        {
            System.out.println("Lista vazia");
        }
        
    } 

    public void displayTarefas ()
    {
        if(!this.tarefas.isEmpty())
        {
            for(Tarefa tasks: tarefas)
            {
                System.out.println(tasks.getDescricao());
            }
            System.out.printf("\n");
        }else
        {
            System.out.println("Lista vazia");
        }
        
    }

    public int obterNumeroTotalTarefas()
    {
        return this.tarefas.size();
    }

    public ArrayList<String> obterDescricoesTarefas()
    {
        if(!this.tarefas.isEmpty())
        {
            ArrayList<String> listaDescricaoTarefas = new ArrayList<String>();

            for(Tarefa task : tarefas)
            {
                listaDescricaoTarefas.add(task.getDescricao());
            }
            return listaDescricaoTarefas;
        }
        
        System.out.println("A lista esta vazia");
        return null;
    }
}
