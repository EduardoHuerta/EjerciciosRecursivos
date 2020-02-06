package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de resultados de la serie de Fibonacci: ");
        long limite = scanner.nextLong();
        //Serie fibonacci
        // 1 1 2 3 5 8 13 21 34 55
        System.out.println("\n Los primeros "+ limite + " de la serie Fibonacci son: ");
        fibonacciRecursivo(limite, 0,1);

    }

    public static void fibonacciRecursivo(long limite, long anterior, long actual) {
        if (limite > 0 ){
            System.out.println(" " + actual);
            fibonacciRecursivo(limite-1, actual,anterior + actual);
        }
    }
}
