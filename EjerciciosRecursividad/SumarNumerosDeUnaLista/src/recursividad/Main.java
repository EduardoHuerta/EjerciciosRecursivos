package recursividad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println("Suma de numeros de una lista:" + sumarNumerosLista(numeros));
    }

    public static Integer sumarNumerosLista(List<Integer> numeros) {
        if (numeros == null || numeros.size() == 0) {
            throw new NullPointerException("el arreglo no debe ser nulo o vacio.");
        } else if (numeros.size() == 1) {
            return numeros.get(0);  //Caso base
        }

        return numeros.get(0) + sumarNumerosLista(numeros.subList(1, numeros.size()));
    }
}
