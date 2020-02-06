package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros quiere ingresar?");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Cargar los Valores :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // LLAMADA A LA FUNCIÓN PARA SUMAR LOS VALORES DE UN ARRAY DE FORMA RECURSIVA
        System.out.println(sumarValores(arr, arr.length - 1));
    }

}

