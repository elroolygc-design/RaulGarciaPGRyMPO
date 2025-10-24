package YoEntradaCal;

    /*
    * 1. declarar las variables num1 y num2 enteras.
    * 2. crear otra clase para meter las los operadores
    *    con el objetivo de familiarizarse con las variables auxiliares
    *    y llamar de otras clases a metodos.
    * 3. se le llama al main principal  con las entrada de datos.
    * 4. se declaran los comentarios.
    * 5. Los resultados.
    *
    * quiero sin declarar las variables num1 y num2 en Operaciones, funque.
    *
    * */

// import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;

        Operaciones entrada = new Operaciones();


        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        num1 = input.nextInt();

        System.out.println("Ingresa el segundo número: ");
        num2 = input.nextInt();

        entrada.main();



        

    }


}


