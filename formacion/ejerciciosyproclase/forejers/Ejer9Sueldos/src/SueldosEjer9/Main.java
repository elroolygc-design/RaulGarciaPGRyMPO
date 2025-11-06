package SueldosEjer9;

// 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€. (Sueldos)
/*
*  1. Crear una entrada para que controles cuando quieres que funcione el algoritmo.
*  2. Crear las variables de sueldo, suma, media.
*  3. Crear el bucle de 900 a 1900 con un incremento de +100.
*         4.Creamos una condicion con un if con la condicion de que sea mayor que 1k.
*         5.El else con que sea menor de 1k.
*         6.Crear las operaciones de suma y la media habiendo asignado primero el  antes del bucle para que nos se repita.
*         7.Resultados.
* */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        Sueldos conexion = new Sueldos();
        conexion.ejer9();

    }
}