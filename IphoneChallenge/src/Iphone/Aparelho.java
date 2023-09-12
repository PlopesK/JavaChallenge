package Iphone;

import java.util.*;

public class Aparelho {
    private final Map<Integer, String> aparelhoMap;
    private boolean ligando;

    public Aparelho() {
        this.aparelhoMap = new HashMap<>();
    }

    // ------------------ Ações com o contato ------------------
    public void adicionarContato(String nome, Integer telefone) {
        aparelhoMap.put(telefone, nome);
    }

    public void removerContato(Integer telefone) {
        if(!aparelhoMap.isEmpty()) {
                aparelhoMap.remove(telefone);
        } else {
            System.out.println("Agenda vazia!");
        }
    }

    public void exibirContato() {
        System.out.println(aparelhoMap);
    }

    // ------------------ Ligar, Atender e Correio de Voz ------------------

    public void iniciarCorreioVoz(int telefone, String mensagem) {
        System.out.println("\nConversa com " + telefone);
        System.out.println(mensagem);
    }

    public void ligar(int telefone) {
        System.out.println("\nLigando para " + telefone);
        ligando = true;
    }

    public void encerrar() {
        if(ligando) {
            System.out.println("\nLigação encerrada!");
            ligando = false;
        } else {
            System.out.println("\nVocê não está em uma ligação!");
        }
    }

    public void atender(int telefone) {
        if(ligando) {
            System.out.println("\nAtendendo " + telefone);
            System.out.println("\nLigação em andamento!");
        } else {
            System.out.println("\nVocê não tem ligações!");
        }
    }
}
