import java.util.Scanner;
//<>
public class Main {
    public static void main(String[] args) {
        //Entrada del numero elegido del usuario entre el 3 y el 4. (solo esos 2)
        Scanner sc = new Scanner(System.in);
        int num = 0; //Variable para que el user ponga los numeros en la entrada de datos
        boolean valido = false;

        while (!valido) { //bucle: si la variable boleana no se cumple se crea esta funcion
            try {
                System.out.print("Introduce el tamaño de la matriz (n): ");
                num = Integer.parseInt(sc.nextLine());

                if (num < 3 || num > 4) { //Si es 3 y 4 si, sino no.
                    System.out.println("Solo se permiten valores 3 o 4. Inténtalo de nuevo.\n");
                } else {
                    valido = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes introducir un número entero y solo el 3, o el 4.\n");
            }
        }
        //Conexión con Cuadradomagico. 
        Cuadradomagico cuadrado = new Cuadradomagico(num);
        cuadrado.buscarCuadradoMagico();
    }
}
