package catalogue;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros()
    {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano)
    {
        Livro livro = new Livro(titulo, autor, ano);
        this.livros.add(livro);
    }

    public void adicionarLivro(Livro livro)
    {
        this.livros.add(livro);
    }

    public void pesquisarPorAutor(String autor)
    {
        if(!this.livros.isEmpty())
        {
            Boolean encontrado = false;
            System.out.println("Livros do autor : " + autor);
            for(Livro l: livros)
            {
                if(l.getAutor().equals(autor))
                {
                    if(encontrado == false)
                    {
                        encontrado = true;
                    }
                    System.out.println("Livro : "+l.getTitulo()+" Ano de publicacao : "+ l.getAnoDePublicacao());
                }
            }
            if(!encontrado)
            {
                System.out.println("Nao temos nenhum livro do autor "+autor+" em nossa base de dados :( ");
            }
        }else
        {
            System.out.println("A lista de Livros esta vazia");
        }
        System.out.printf("\n");
    }

    public void pesquisarPorIntervaloDeAnos(int anoInicial , int anoFinal)
    {
        if(!this.livros.isEmpty())
        {
            Boolean encontrado = false;
            System.out.println("Livros entre " + anoInicial+" e "+ anoFinal + " :");
            for(Livro l: livros)
            {
                if(l.getAnoDePublicacao() > anoInicial && l.getAnoDePublicacao() < anoFinal)
                {
                    if(encontrado == false)
                    {
                        encontrado = true;
                    }
                    System.out.println("Livro : "+l.getTitulo()
                    +" Ano de publicacao : "+ l.getAnoDePublicacao()
                    +" autor: "+ l.getAutor());
                }
            }
            if(!encontrado)
            {
                System.out.println("Nao temos nenhum livro entre os anos "+anoInicial
                +" e "+anoFinal+" em nossa base de dados :( ");
            }
        }else
        {
            System.out.println("A lista de Livros esta vazia");
        }
        System.out.printf("\n");
    }

    public void pesquisarPorTitulo(String titulo)
    {
        if(!this.livros.isEmpty())
        {
            Boolean encontrado = false;
            System.out.println("Livros com titulo : " + titulo);
            for(Livro l: livros)
            {
                if(l.getTitulo().equals(titulo))
                {
                    if(encontrado == false)
                    {
                        encontrado = true;
                    }
                    System.out.println("Livro : "+l.getTitulo()+" Ano de publicacao : "+ l.getAnoDePublicacao()+" autor: "+ l.getAutor());
                }
            }
            if(!encontrado)
            {
                System.out.println("Nao temos nenhum livro com o titulo "+titulo+" em nossa base de dados :( ");
            }
        }else
        {
            System.out.println("A lista de Livros esta vazia");
        }
        System.out.printf("\n");
    }
}
