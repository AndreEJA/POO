package run;

public class Libro {

    //Asignar atributos

    String titulo;
    String autor;
    int numPaginas;

    //Constructor

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    //Metodo para crear la descripción

    public String mostrarDescripcion(){
        return "El libro '" + titulo + "' fue escrito por " + autor + " y cuenta con un total de " + numPaginas + " paginas";

    }
}
