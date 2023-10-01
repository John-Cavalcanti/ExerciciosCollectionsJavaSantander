package Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDePessoas {
    List<Pessoa> pessoas;

    public OrdenacaoDePessoas()
    {
        pessoas = new ArrayList<Pessoa>();
    }

    public void mostrarPessoas()
    {
        for(Pessoa p: pessoas)
        {
            System.out.println("Nome : "+p.getNome()+"\t || Idade: "+p.getIdade()+"\t || Altura :"+p.getAltura());
        }
        System.out.println("\n");
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void adicionarPessoas(Pessoa pessoa)
    {
        pessoas.add(pessoa);
    }

    public void adicionarPessoas(String nome, int idade, double altura)
    {
        Pessoa novaPessoa = new Pessoa(nome, idade, altura);
        pessoas.add(novaPessoa);
    }

    public void ordenarPorIdade()
    {
        Collections.sort(pessoas);
    }

    public void ordenarPorAltura()
    {
        Collections.sort(pessoas, new ComparatorPorAltura());
    }
}
