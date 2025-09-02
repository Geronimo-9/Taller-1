public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;



public Estudiante(){

    this.nombre = "Thalia";
    this.edad = 23;
    this.curso = "Semestre 5";

}




public Estudiante (String nombre, int edad){
this.nombre = nombre;
this.edad = edad;
}



    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }


public String toString(){
    return "Nombre: "+nombre+" Edad: "+edad+" Curso: "+curso+" ";
}
}
