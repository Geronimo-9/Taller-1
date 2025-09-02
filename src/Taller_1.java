import java.util.Scanner;

public class Taller_1 {
    public static void main(String[] args) {

//Scanner teclado = new Scanner(System.in);


//Clase Libro, Ejercicio 1
Libro l1 =  new Libro();
Libro l2 = new Libro("Mi primera vez", "Guillermo", 200);

        System.out.println(l1);
        System.out.println(l2);




//CLase Estudiante, ejercicio 3
Estudiante e1 = new Estudiante();
Estudiante e2 = new Estudiante("Carlos", 90); //sale null debido al meetodo toString()
Estudiante e3 = new Estudiante("Mariano", 34, "Semestre 7");


        System.out.println(e1);

        System.out.println(e2);
        System.out.println(e3);




     }
 }

