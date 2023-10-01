package Pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura)
    {
        setAltura(altura);
        setIdade(idade);
        setNome(nome);
    }

    public int compareTo(Pessoa pessoa)
    {
        return Integer.compare(this.idade, pessoa.idade);
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString()
    {
        return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", altura=" + altura +
        '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
