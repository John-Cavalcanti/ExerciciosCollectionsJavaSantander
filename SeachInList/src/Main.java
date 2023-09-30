import catalogue.CatalogoLivros;
import catalogue.Livro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("xablau", "xablonso", 1969);
        Livro l2 = new Livro("xablau", "xablinio", 2015);
        Livro l3 = new Livro("cereja", "cerejo",  2024);
        Livro l4 = new Livro("amiga", "amigo", 2004);
        Livro l5 = new Livro("xablas", "xablonso", 1972);
        Livro l6 = new Livro("xero", "alinio", 1965);

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro(l1);
        catalogo.adicionarLivro(l2);
        catalogo.adicionarLivro(l3);
        catalogo.adicionarLivro(l4);
        catalogo.adicionarLivro(l5);
        catalogo.adicionarLivro(l6);

        catalogo.pesquisarPorAutor("xablonso");
        catalogo.pesquisarPorAutor("cerejo");
        catalogo.pesquisarPorAutor("anfonso");
        catalogo.pesquisarPorTitulo("xablau");
        catalogo.pesquisarPorTitulo("cereja");
        catalogo.pesquisarPorTitulo("senhor dos aneis");
        catalogo.pesquisarPorIntervaloDeAnos(2000, 2025);
        catalogo.pesquisarPorIntervaloDeAnos(1920, 1930);

    }
}
