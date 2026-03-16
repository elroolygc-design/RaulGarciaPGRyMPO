package SueldosEjer9;

import java.util.Scanner;

public class Sueldos {
    public void ejer9 () {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Pon ya para que funque: ");
        String entra = entradaDatos.nextLine();
        entra = "ya";
        //variable del sueldo.
        int sueldo;

        // variable de las operaciones.
        int sumaTotal = 0;
        int mediaTotal = 0;

        //La función principal.
        for (int i = 900; i <= 1900; i = i + 100) {

            // variable de sueldo.
             sueldo = i;
            System.out.println("El sueldo es: " + sueldo);


            // Condicion de si es mayor  que 1k.
            if (sueldo >= 1000) {
                System.out.println("todos los sueldos de mas de 1k");
            } else {
                System.out.println("todos los sueldos de menos de 1k");
            }

            // Operaciones.
            sumaTotal = sumaTotal + sueldo;
            mediaTotal = sumaTotal / 10;

            //Resultados.
            System.out.println("La suma es: "+sumaTotal);
            System.out.println("La media es: "+mediaTotal);



        }

    }
}

