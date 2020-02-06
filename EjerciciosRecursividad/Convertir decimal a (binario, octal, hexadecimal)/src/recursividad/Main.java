package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cifra: ");
        int cifra = leer.nextInt();
        System.out.print("\nbinario:\t");
        binario(cifra);
        System.out.print("\noctal:\t\t");
        octal(cifra);
        System.out.print("\nHexadecimal:\t");
        hexadecimal(cifra);
        System.out.println();
    }

    //SE IMPLEMENTA UN METODO RECURsIVO PARA TRANSFORMAR A BINARIO LA CIFRA
    public static void binario(int N) {
        if (N == 1) System.out.print("1");
        else {
            binario(N / 2);
            System.out.print(N % 2);
        }
    }

    //SE IMPLEMENTA UN METODO RECURCIVO PARA TRANSFORMARA A OCTAL LA CIFRA
    public static void octal(int N) {
        if (N < 8) System.out.print(N);
        else {
            octal(N / 8);
            System.out.print(N % 8);
        }
    }

    //SE IMPLEMENTA UN METODO RECURCIVO PARA TRANSFORMARA A HEXADECIMAL LA CIFRA
    public static void hexadecimal(int N) {
        if (N < 16) {
            if (N == 10) System.out.print("A");
            if (N == 11) System.out.print("B");
            if (N == 12) System.out.print("C");
            if (N == 13) System.out.print("D");
            if (N == 14) System.out.print("E");
            if (N == 15) System.out.print("F");
            if (N < 10) System.out.print(N);
        } else {
            hexadecimal(N / 16);
            System.out.print(N % 16);
        }
    }
}
