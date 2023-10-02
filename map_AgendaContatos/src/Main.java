import agenda.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Joao", 512);
        agenda.adicionarContato("Thiago", 511);
        agenda.adicionarContato("ana", 510);

        agenda.exibirContatos();

        System.out.println("\nretirando ana");
        agenda.removerContato("ana");
        agenda.exibirContatos();

        System.out.println("\nadicionando bruno");
        agenda.adicionarContato("bruno", 500);
        agenda.exibirContatos();
        
        System.out.println("\npesquisando o numero de Thiago");
        agenda.pesquisarPorNome("Thiago");

    }
    
}
