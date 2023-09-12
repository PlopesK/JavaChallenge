package Iphone.Navegador;

public class Pagina {
    private String URL;
    private String titulo;

    public Pagina(String URL, String titulo) {
        this.URL = URL;
        this.titulo = titulo;
    }

    public String getURL() {
        return URL;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\nPagina {" +
                "URL= '" + URL + '\'' +
                ", titulo= '" + titulo + '\'' +
                "}\n";
    }
}
