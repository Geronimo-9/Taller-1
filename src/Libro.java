public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;


     public Libro() {
        this.titulo = "Meditaciones";
        this.autor = "Aristoteles";
        this.numeroPaginas = 250;
    }



    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }






    public String toString(){
        return " Titulo: "+titulo+" Autor: "+autor+" Pag: "+numeroPaginas+" ";
    }






}















