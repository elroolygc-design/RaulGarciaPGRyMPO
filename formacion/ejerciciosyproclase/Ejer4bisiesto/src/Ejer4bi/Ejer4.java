package Ejer4bi;

import java.util.Scanner;

public class Ejer4 {
    public void bisiestocon() {

        //Entrada de datos
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Entrada de numero de año: ");
        int numeroAno = entradaDatos.nextInt();

        //OVariables de operaciones.
        int multiploCuatro = numeroAno % 4;
        int multiploDos = numeroAno % 2;


        // Trabajo.
        if (multiploCuatro == 0 && multiploDos == 0) {
            System.out.println("Es año bisiesto y verán la virgen");
        } else if ( multiploCuatro != 0 && multiploDos == 0){
            System.out.println("No es bisiesto pero si viene la vigen");
        } else if (multiploCuatro == 0 && multiploDos != 0) {
            System.out.println("Es bisiesto, pero no viene la virgen");
        } else {
            System.out.println("no es bisiesto, ni viene la virgen");
        }
    }
}
