import java.util.Scanner;

public class Taller_1 {
    public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);


//Clase Libro, Ejercicio 1
Libro l1 =  new Libro();
Libro l2 = new Libro("Mi primera vez", "Guillermo", 200);

        System.out.println(l1);
        System.out.println(l2);




   // Clase cuentaBancaria, Ejercicio 2
cuentaBancaria gero = new cuentaBancaria(6890, 450, "nomina");
gero.mostrarDetalles();

cuentaBancaria test = new cuentaBancaria();
test.mostrarDetalles();







//Clase Estudiante, ejercicio 3
Estudiante e1 = new Estudiante();
Estudiante e2 = new Estudiante("Carlos", 90); //sale null el campo curso debido al metodo toString()
Estudiante e3 = new Estudiante("Mariano", 34, "Semestre 7");


        System.out.println(e1);

        System.out.println(e2);
        System.out.println(e3);


//Proyecto Integrador

        System.out.println("Introduce tu nombre");
        String estudiante = teclado.nextLine();

        System.out.println("¿Cuantos años tienes?");
        int edad = teclado.nextInt();

teclado.nextLine(); // Evita salto de linea

        System.out.println("¿Que curso estas haciendo?");
        String grado = teclado.nextLine();

        Estudiante geroStudents = new Estudiante(estudiante,edad,grado);



        System.out.println("Introduce el nombre del libro");

        String libro = teclado.nextLine();
        String autor = "Geronimo Mijares";
        int paginas = 200;

        Libro geroBook = new Libro(libro,autor,paginas);


teclado.nextLine();


        System.out.println("Ingrese la cantidad de saldo en tu cuenta");
        double saldoDisponible = teclado.nextDouble();

String[] cuenta = new String[3];
        cuenta[0] = "Ahorro";
        cuenta[1] = "Nomina";
        cuenta[2] = "Credito";

        System.out.println("Ingrese su numero de cuenta (0-2999)");
int numCuenta;

do {
    numCuenta = teclado.nextInt();



}while(numCuenta < 0 && numCuenta >= 3000);

String tuCuenta = ""; // recoge el tipo de cuenta cuando el usuario ingresa el numero de cuenta.

        if (numCuenta < 1000) {
            tuCuenta = cuenta[0];
        } else if (numCuenta >= 1000 && numCuenta < 2000){
            tuCuenta = cuenta[1];
        } else if (numCuenta >= 2000 && numCuenta < 3000){
            tuCuenta = cuenta[2];
        }
        cuentaBancaria miCuenta = new cuentaBancaria(numCuenta,saldoDisponible,tuCuenta);



        System.out.println(geroStudents);
        System.out.println(geroBook);
        System.out.println(miCuenta);





















     }
 }

