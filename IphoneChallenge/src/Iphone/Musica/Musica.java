package Iphone.Musica;

public class Musica {
    private String titulo;
    private String cantores;
    private double tempo;

    public Musica(String titulo, String cantores, double tempo) {
        this.titulo = titulo;
        this.cantores = cantores;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCantores() {
        return cantores;
    }

    @Override
    public String toString() {
        return "\n '" + titulo + '\'' + ", cantores= '" + cantores + '\'' + ", tempo= " + tempo + "\n";
    }
}
