package Ejer10swith;

import java.util.Scanner;

/*
*  Crea un programa que permita al usuario
*  ingresar un código de producto (como una cadena de caracteres),
*  utilizando una sentencia switch,
*  muestre el nombre del producto
*  y su precio correspondiente.
*
*Yo lo estoy creando en base a una aplicacion ficticia
* de organizacion personal por areas enfocado este ejercicio
* a los planes de subscripción que tendria.
*
* */
public class Main {
    public static void main(String[] args) {
        //Como  siempre usamos esta clase como gestor de los archivos importantes.
        Scanner entradaDatos = new Scanner(System.in);
        Ejer4s conexion = new Ejer4s();
        conexion.prod();
        }
    }
