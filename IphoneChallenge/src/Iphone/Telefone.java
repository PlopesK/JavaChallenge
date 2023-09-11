package Iphone;

public class Telefone {
    private String nome;
    private int telefone;

    public Telefone(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "\n" + "nome= " + nome + ", telefone= " + telefone + "\n";
    }
}
