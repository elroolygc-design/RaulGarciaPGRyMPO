package ejercicio4;

import java.util.Scanner;

/* Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
que un mismo equipo no puede jugar más de un partido
*
*Objetivo: que repita la accion de Poner el pais del primer bombo 5 veces y los guarde
*/
public class Main {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Paises del primer bombo: ");
        String [] bombo1 = new String[5];{entradaDatos.nextLine();}
        if (Boolean.parseBoolean(bombo1[5])) {



        } else if (!Boolean.parseBoolean(bombo1[5])) {
            System.out.println("Paises del primer bombo: ");
        } else {
            System.out.println("Fuera del algoritmo");
        }
    }
}
