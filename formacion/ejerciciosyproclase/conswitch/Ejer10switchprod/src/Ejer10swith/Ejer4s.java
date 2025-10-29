package Ejer10swith;

import java.util.Scanner;

public class Ejer4s {
    public void prod () {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Sin inversion: el elegido");
        System.out.println("Invirtiendo 3 euros: el paciente");
        System.out.println("Invirtiendo 12 euros: el resiliente");

        //Entrada de datos
        System.out.println("Ingresa su tipo de version de las tres mencionadas: ");
        String versionsubdeCM = entradaDatos.nextLine();

        //variables del precio y el producto de los planes
        String prods;
        double precio;

        // el proceso para elegir el plan de pago de los usuarios de mi app ficticia.
        switch (versionsubdeCM) {
            case "el elegido": //plan gratis de la app
                prods = "inluye la personalizacion logica y anuncios";
                precio = 0;
                System.out.println("El producto de la version elegido es: "+prods);
                System.out.println("El precio de la version elegido es: "+precio);
                break;
            case "el paciente": //plan mas basico de pago
                prods = "incluye la personalización personal y espiriual sin anuncios audiovisuales, solo banners";
                precio = 3;
                System.out.println("El producto de la version paciente es: "+prods);
                System.out.println("El precio de la version paciente es: "+precio);
                break;
            case "el resiliente": // plan con mas soluciones y mejoras por mas dinero.
                prods = "incluye la personalizacion mental y emocional, no tiene anuncios, ia adaptada gratis";
                precio = 12;
                System.out.println("El producto de la version resiliente es: "+prods);
                System.out.println("El precio de la version resiliente es: "+precio);
                break;

                default: //si pone incoherente, al usuario le salta este mensaje.
                System.out.println("No existe");
                break;
        }



    }
}
