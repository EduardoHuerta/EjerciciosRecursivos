package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = 0;
        System.out.println("Ingrese el valor del numero: ");
        base = sc.nextInt();
        System.out.println("Ingrese el valor del exponente: ");
        int exponente = 0;
        exponente = sc.nextInt();

        System.out.println(potencia(base, exponente));

    }


}
