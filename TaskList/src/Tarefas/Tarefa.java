package Tarefas;
public class Tarefa {
    private String Descricao;

    public Tarefa(String descricao)
    {
        setDescricao(descricao);
    }

    public String getDescricao() {
        return this.Descricao;
    }
    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }
}
