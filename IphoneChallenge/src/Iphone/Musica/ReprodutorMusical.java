package Iphone.Musica;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<Musica> musicaList;
    private boolean tocando;

    public ReprodutorMusical() {
        this.musicaList = new ArrayList<>();
    }

    //Controle das Músicas
    public void adicionarMusica(String titulo, String cantores, double tempo) {
        musicaList.add(new Musica(titulo, cantores, tempo));
    }

    public void exibirMusicas(){
        if(!musicaList.isEmpty()) {
            System.out.println(musicaList);
        } else {
            System.out.println("\nNenhuma música foi adicionada!");
        }

    }

    public void removerMusica(String titulo) {
        List<Musica> removerMusicas = new ArrayList<>();
        if(!musicaList.isEmpty()){
            for (Musica m : musicaList) {
                if (m.getTitulo().equalsIgnoreCase(titulo)) {
                    removerMusicas.add(m);
                    System.out.println("***********" + removerMusicas + " foi removido(a)***********");
                    break;
                }
            }
            musicaList.removeAll(removerMusicas);
        } else {
            System.out.println("\nSem músicas para remover!");
        }
    }

    // Ações com Músicas
    public void selecionarMusica(String titulo) {
        System.out.println("\n" + titulo + "\n");
    }

    public void tocar() {
        if(!tocando) {
            System.out.println("\nTocando!\n");
            tocando = true;
        } else {
            System.out.println("\nReiniciando!\n");
        }
    }

    public void pausar() {
        if(tocando) {
            System.out.println("\nMúsica pausada!");
            tocando = false;
        } else {
            System.out.println("\nNenhuma música está tocando!");
        }
    }
}
