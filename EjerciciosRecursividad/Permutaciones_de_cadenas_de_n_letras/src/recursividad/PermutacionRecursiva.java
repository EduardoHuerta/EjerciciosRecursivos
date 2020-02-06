package recursividad;

import java.util.ArrayList;
import java.util.List;

/*
* cuando la entrada es una cadena vacía, la única permutación es una cadena vacía.
* Intente para cada una de las letras de la cadena haciéndola como la primera letra y
* luego encuentre todas las permutaciones de las letras restantes mediante una llamada recursiva.
* */
public class PermutacionRecursiva {

    public static void main(String[] args) {
        List<String> perms = permutacion("", "abcd");

        String[] array = new String[perms.size()];
        for (int i = 0; i < perms.size(); i++) {
            array[i] = perms.get(i);
        }

        int x = array.length;

        for (final String anArray : array) {
            System.out.println(anArray);
        }
    }

    private static List<String> permutacion(String prefix, String cadena) {
        List<String> permutaciones = new ArrayList<>();
        int numeroDeCaracteres = cadena.length();
        if (numeroDeCaracteres == 0) {
            permutaciones.add(prefix);
        } else {
            for (int i = 0; i < numeroDeCaracteres; i++) {
                permutaciones.addAll(permutacion(prefix + cadena.charAt(i),
                        cadena.substring(i + 1, numeroDeCaracteres) + cadena.substring(0, i)));
            }
        }
        return permutaciones;
    }


}
