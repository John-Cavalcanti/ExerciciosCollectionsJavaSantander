import Pessoas.OrdenacaoDePessoas;
import Pessoas.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("joao", 22, 1.80);
        Pessoa p2 = new Pessoa("thiago", 20, 1.70);
        Pessoa p3 = new Pessoa("amanda", 15, 1.50);
        Pessoa p4 = new Pessoa("bruno", 26, 1.65);
        Pessoa p5 = new Pessoa("maria", 30, 1.75);

        OrdenacaoDePessoas listaPessoas = new OrdenacaoDePessoas();

        listaPessoas.adicionarPessoas(p1);
        listaPessoas.adicionarPessoas(p2);
        listaPessoas.adicionarPessoas(p3);
        listaPessoas.adicionarPessoas(p4);
        listaPessoas.adicionarPessoas(p5);

        System.out.println("Ordem de entrada : ");
        listaPessoas.mostrarPessoas();

        System.out.println("Ordem por altura : ");
        listaPessoas.ordenarPorAltura();
        listaPessoas.mostrarPessoas();

        System.out.println("Ordem por idade : ");
        listaPessoas.ordenarPorIdade();
        listaPessoas.mostrarPessoas();

    }
}
