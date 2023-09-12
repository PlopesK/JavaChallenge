package Iphone;

import java.util.*;

public class Navegador {
    private final Map<String, String> siteMap;
    private boolean aberta;

    public Navegador() {
        this.siteMap = new HashMap<>();
    }

    public void adicionarNovaAba(String URL, String titulo) {
        siteMap.put(URL, titulo);
    }

    public void fecharAba(String URL) {
        if(!siteMap.isEmpty()) {
            siteMap.remove(URL);
        } else {
            System.out.println("\nNenhuma aba aberta!");
        }
    }

    public void exibirTodasAbas() {
        System.out.println(siteMap);
    }

    public void exibirPagina(String URL) {
        System.out.println("\nAbrindo " + URL);
        aberta = true;
    }

    public void atualizarPagina(String URL) {
        if(aberta) {
            System.out.println("\nAtualizando página...");
        } else {
            System.out.println("\nNenhuma página aberta!");
        }
    }
}

