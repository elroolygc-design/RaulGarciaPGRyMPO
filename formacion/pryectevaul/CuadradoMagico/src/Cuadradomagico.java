import java.util.*;



public class Cuadradomagico {
    //variable
    private int num;

    //Constructor
    public Cuadradomagico(int num) {
        this.num = num;
    }
    //La funcion que busca el cuadrado.
    public void buscarCuadradoMagico() {
        int intentos = 0;  //Variable de los intentos.
        int[][] matriz;   //Variable Array bidimensional de la matriz

        while (true) { //Bucle while si se cumple la matriz magica con 3 y 4.
            intentos++; //Para que busque los intentos.
            matriz = generarMatriz(); //Genera la matriz.
            if (esCuadradoMagico(matriz)) { //Si es una matriz magica o no.
                System.out.println("\n=== CUADRADO MÁGICO ENCONTRADO ===");
                imprimirMatriz(matriz); //Se imprime la matriz en pantalla para que el user lo vea.
                int constanteMagica = sumaFila(matriz, 0); //La constante de la suma de la primera fila que tiene que ser la misma suma en todas las filas, columnas, y diagonales.
                System.out.println("\nConstante mágica: " + constanteMagica); //Se enseña la constante magica
                System.out.println("Intentos realizados: " + intentos); //Se enseña el numero de intentos
                break;
            }
        }
    }

    private int[][] generarMatriz() {
        int[][] matriz = new int[num][num];
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= num * num; i++) { // Generación de los numeros desde el 1 porque si fuera 00 no se podria hacer
            numeros.add(i);
        }
        Collections.shuffle(numeros); //Mezclar los numeros sin que se repitan y en orden alatorio
        int index = 0;
        for (int i = 0; i < num; i++) { // Recorrido de las posiciones usando la variable index.
            for (int j = 0; j < num; j++) {
                matriz[i][j] = numeros.get(index++);
            }
        }

        return matriz;
    }

    private boolean esCuadradoMagico(int[][] m) {
        int sumaObjetivo = sumaFila(m, 0);

        for (int i = 0; i < num; i++) {
            if (sumaFila(m, i)!= sumaObjetivo) { // Si la fila i no suma lo mismo que la constante magica no va la matriz
                return false;
            }
        }
        for (int j = 0; j < num; j++) {
            if (sumaColumna(m, j)!= sumaObjetivo){ // Si la columna j no suma lo mismo que la constante magica no va la matriz
                return false;
            }
        }
        // Diagonales.
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < num; i++) {
            //Para las posiciones porque por las posiciones se consiguen las diagonales.
            diag1 += m[i][i];
            diag2 += m[i][num - 1 - i];
        }
        return diag1 == sumaObjetivo && diag2 == sumaObjetivo;
    }
    //La suma de todos los elementos de una fila
    private int sumaFila(int[][] m, int fila) {
        int suma = 0;
        for (int j = 0; j < num; j++) {
            suma += m[fila][j]; // porque esto? "suma += m[fila][j];"
        }
        return suma;
    }
    //La suma de todos los elementos de una columna
    private int sumaColumna(int[][] m, int col) {
        int suma = 0;
        for (int i = 0; i < num; i++) {
            suma += m[i][col];
        }
        return suma;
    }
    //Imprimir matriz
    private void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {  //Recorre cada fila
            for (int num : fila) { //Recorre cada numero dentro de la fila
                System.out.printf("%3d ", num); //Imprime cada numero de la matriz con 3 espacios de ancho.
            }
            System.out.println(); //Para saltar a la siguiente fila y que no se quede sin espacios
        }
    }
}
