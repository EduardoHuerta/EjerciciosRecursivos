package recursividad;

/*
        * El código gris es un sistema de numeración binario donde dos valores sucesivos difieren en un solo bit.
        * Dado un número entero no negativo n que representa el número total de bits en el código, imprima la secuencia del código gris. Una secuencia de código gris debe comenzar con 0.
        * Por ejemplo, dado n = 2, devuelve [0,1,3,2]. Su secuencia de código gris es:
        00 - 0
        01 - 1
        11 - 3
        10 - 2

        * Nota:
        * Para un n dado, una secuencia de código gris no está definida de forma exclusiva.
        * Por ejemplo, [0,2,3,1] también es una secuencia de código gris válida según la definición anterior.
        * Por ahora, el juez puede juzgar basándose en una instancia de secuencia de código gris. Lo siento por eso.
        */
public class Main {

    public static void codigoGray(int n) {
        codigoGray("", n);
    }

    private static void codigoGray(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            codigoGray(prefix + "0", n - 1);
            gray(prefix + "1", n - 1);
        }
    }

    public static void gray(String prefix, int n) {
        if (n == 0) System.out.println(prefix);
        else {
            codigoGray(prefix + "1", n - 1);
            gray(prefix + "0", n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Gray code de 3:");
        codigoGray(3);
    }

}
