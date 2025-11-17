package Ejer3mayornumero;


import java.util.Scanner;

// <>
public class Main {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Pon ya: ");
        String ya = entradaDatos.nextLine();
                ya = "ya";

        Ejer3whiled conexion = new Ejer3whiled();
        conexion.MayorNumero();
    }
}