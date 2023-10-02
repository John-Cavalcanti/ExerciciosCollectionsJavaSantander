package agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> contatos;

    public AgendaContatos()
    {
        contatos = new HashMap<String, Integer>();
    }

    public void adicionarContato(String nome, Integer telefone)
    {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome)
    {
        contatos.remove(nome);
    }

    public void exibirContatos()
    {
        System.out.println("Contatos:");
        for(Map.Entry<String, Integer> m: contatos.entrySet())
        {
            System.out.println("Nome:  "+m.getKey()+"\t|| Contato: "+m.getValue());
        }
    }

    public void pesquisarPorNome(String nome)
    {
        System.out.println("Contato cujo nome solicitado "+ nome+" eh : "+ contatos.get(nome));
    }
}
