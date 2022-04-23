package practicaComic;

public class Comic {

    private String titulo;
    private String autor;
    private String volumen;

    public Comic(String titulo, String autor, String volumen){
        this.titulo = titulo;
        this.autor = autor;
        this.volumen = volumen;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getVolumen(){
        return volumen;
    }

    public String showMessage(){
        return "Titulo: " + titulo + "\n" +
                " Autor: " + autor + "\n" +
                " Volumen: " + volumen + "\n";
    }

}
