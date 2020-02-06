package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0, numero2 = 0;
        System.out.println("Ingrese el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = scanner.nextInt();

        System.out.println("\nEl resultado del MCD de "+ numero1 + " y " + numero2 + " es: " + obtener_mcd(numero1, numero2));


    }

    static int obtener_mcd(int numero1, int numero2) {
        if (numero2 == 0)
            return numero1;
        else
            return obtener_mcd(numero2, numero1 % numero2);
    }
}
