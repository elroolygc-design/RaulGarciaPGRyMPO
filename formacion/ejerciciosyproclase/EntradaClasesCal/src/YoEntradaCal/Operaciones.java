package YoEntradaCal;


import java.util.Scanner;

public class Operaciones {


    public void main() {

        //variables de entrada de datos;

       Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sumar;
        int restar;
        int multi;
        int divi;
        int resto;

        double divireal;
        double restoreal;


        //Operaciones
        sumar = num1 + num2;
        restar = num1 - num2;

        multi = num1 * num2;
        divi = num1 / num2;
        resto = num1 % num2;

        divireal = num1 / num2;
        restoreal = num1 % num2;


        //resultados
        System.out.println("El resultado de la suma: "+sumar);
        System.out.println("El resultado de la resta: "+restar);

        System.out.println("El resultado de la multi: "+multi);
        System.out.println("El resultado de la divi: "+divi);
        System.out.println("El resultado del resto: "+resto);

        System.out.println("El resultado de la division real en decimal: "+divireal);
        System.out.println("El resultado del resto real en decimal: "+restoreal);


    }

}
