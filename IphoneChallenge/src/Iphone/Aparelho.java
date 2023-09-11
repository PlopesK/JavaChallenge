package Iphone;

import java.util.HashMap;
import java.util.Map;

public class Aparelho {
    private Map<String, Integer> aparelhoMap;

    public Aparelho() {
        this.aparelhoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        aparelhoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!aparelhoMap.isEmpty()) {
            aparelhoMap.remove(nome);
        } else {
            System.out.println("Agenda vazia!");
        }
    }

    public void exibirContato() {
        System.out.println(aparelhoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!aparelhoMap.isEmpty()) {
            numeroPorNome = aparelhoMap.get(nome);
        } else {
            System.out.println("Agenda vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        Aparelho aparelho = new Aparelho();

        aparelho.adicionarContato("Gabriel João", 2131232);
        aparelho.adicionarContato("Ana", 312321213);
        aparelho.adicionarContato("João", 33231312);
        aparelho.adicionarContato("Julia", 821987312);
        aparelho.adicionarContato("Gabriel", 4444444);

        aparelho.exibirContato();

        aparelho.removerContato("Gabriel João");
        aparelho.exibirContato();

        System.out.println("\nPesquisou o usuário de número: \n" + aparelho.pesquisarPorNome("Gabriel"));
    }
}
