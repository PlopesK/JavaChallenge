import Iphone.Aparelho;
import Iphone.Musica.ReprodutorMusical;
import Iphone.Navegador;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //--------------------- Aparelho ---------------------
        //Contato
        Aparelho aparelho = new Aparelho();

        System.out.println("");
        System.out.println("/////////////////// Iniciando... ///////////////////\n");
        aparelho.adicionarContato("Gabriel João", 2131232);
        aparelho.adicionarContato("Ana", 312321213);
        aparelho.adicionarContato("João", 33231312);
        aparelho.adicionarContato("Julia", 821987312);
        aparelho.adicionarContato("Gabriel", 4444444);

        aparelho.exibirContato();
        System.out.println("--------------------------------------------------");

        aparelho.removerContato(2131232);
        aparelho.exibirContato();
        System.out.println("--------------------------------------------------");

        //Correio de Voz
        aparelho.iniciarCorreioVoz(4444444, "Bom dia!");
        System.out.println("\n--------------------------------------------------");

        //Ligação
        aparelho.encerrar(); //Mensagem quando não está em ligação
        aparelho.ligar(4444444);
        aparelho.atender(4444444);
        aparelho.encerrar(); //Encerrar ligação
        aparelho.atender(4444444); //Mensagem quando atende sem ligação

        //--------------------- Músicas ---------------------
        System.out.println("\n*************************************");
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.adicionarMusica("HANSEL", "SODIKKEN", 5.55);
        reprodutorMusical.adicionarMusica("Cupid", "Jack Stauber", 3.41);
        reprodutorMusical.adicionarMusica("Two Time", "Jack Stauber", 2.20);
        reprodutorMusical.adicionarMusica("My time", "Bo en", 5.14);

        reprodutorMusical.exibirMusicas();
        System.out.println("\n*************************************");

        reprodutorMusical.removerMusica("Two Time");
        reprodutorMusical.exibirMusicas();
        System.out.println("\n*************************************");

        reprodutorMusical.selecionarMusica("HANSEL");
        reprodutorMusical.tocar();
        reprodutorMusical.tocar(); //Reiniciando a música
        reprodutorMusical.pausar();

        //--------------------- Navegador ---------------------
        System.out.println("\n=====================================");
        Navegador navegador = new Navegador();
        navegador.adicionarNovaAba("www.google.com", "Google");
        navegador.adicionarNovaAba("www.youtube.com", "Youtube");
        navegador.adicionarNovaAba("www.instagram.com", "Instagram");
        navegador.adicionarNovaAba("www.facebook.com", "Facebook");

        System.out.println("\nTodas abas abertas: \n");
        navegador.exibirTodasAbas();
        System.out.println("\n=====================================");

        navegador.fecharAba("www.instagram.com");
        System.out.println("\nTodas abas abertas: \n");
        navegador.exibirTodasAbas();
        System.out.println("\n=====================================");

        navegador.exibirPagina("www.google.com");
        navegador.atualizarPagina("www.google.com");

        System.out.println("\n/////////////////// Desligando... ///////////////////");
    }
}