package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Scanner entrada = new Scanner(System.in);
        int numeroFactorial;
        System.out.println("Ingrese el numero que desee realizar su factorial: ");
        numeroFactorial = entrada.nextInt();
        //Guarda el resultado en una variable
        int resultado = factorialRecursivo(numeroFactorial);

        //Muestra el resultado
        System.out.println(resultado);
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de resultados de la serie de Fibonacci: ");
        long limite = scanner.nextLong();
        //Serie fibonacci
        // 1 1 2 3 5 8 13 21 34 55
        System.out.println("\n Los primeros "+ limite + " de la serie Fibonacci son: ");
        fibonacciRecursivo(limite, 0,1);
*/
/*
        * Main objetoHanoi = new Main();
        Scanner entrada = new Scanner(System.in);
        int numeroDeDiscos;
        System.out.println("Ingrese el numero de discos iniciales: ");
        numeroDeDiscos = entrada.nextInt();
        objetoHanoi.torresHanoi(numeroDeDiscos,1,2,3);
        System.out.println("Juego completado");
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere ingresar?");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Cargar los Valores :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // LLAMADA A LA FUNCIÓN PARA SUMAR LOS VALORES DE UN ARRAY DE FORMA RECURSIVA
        System.out.println(sumarValores(arr, arr.length - 1));

/*
        Scanner sc = new Scanner(System.in);
        int base = 0;
        System.out.println("Ingrese el valor del numero: ");
        base = sc.nextInt();
        System.out.println("Ingrese el valor del exponente: ");
        int exponente = 0;
        exponente = sc.nextInt();

        System.out.println(potencia(base, exponente));
*/
/*
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
*/
/*
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero a sumar: ");
        int num = leer.nextInt();
	    int resultado = sumaRecursiva(num);
        System.out.println(resultado);
*/
/*
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;
        System.out.println("Ingrese el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = scanner.nextInt();

        System.out.println("\nEl resultado del MCD de "+ numero1 + " y " + numero2 + " es: " + obtener_mcd(numero1, numero2));
*/

    }

    public static int factorialRecursivo(int numero){
        int resultado;

        if(numero==1){
            //Se termina la recursión
            return 1;
        }else{
            //Se llama asi misma la funcion, con el valor del numero menos 1
            resultado = numero * factorialRecursivo(numero-1);
        }
        //Devolvemos el valor
        return resultado;

    }


    public static void fibonacciRecursivo(long limite, long anterior, long actual) {
        if (limite > 0 ){
            System.out.println(" " + actual);
            fibonacciRecursivo(limite-1, actual,anterior + actual);
        }
    }

    //Metodo recursivo para solucionar las Torres de Hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        //Caso base
        if (discos == 1){
            System.out.println("Mover Disco de Torre" + torre1 + "a Torre" + torre3);
        }else {
            //Dominio
            torresHanoi(discos-1, torre1, torre3, torre2);  //numero de discos este es -1 ya que
                        // se le a quitado un disco, torre inicio, torre destino y torre auxiliar
            System.out.println("Mover Disco de Torre" + torre1 + "a Torre" + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }


    // EL MÉTODO RECOGERÁ EL ARRAY Y LA POSICIÓN DEL ELEMENTO A SUMAR
    public static int sumarValores(int ArregloDeNumeros[], int posicionesDelArreglo) {
        // INICIALIZAMOS UNA VARIABLE CON LA POSICIÓN DEL ARRAY ((NO ES NECESARIO))
        int tamaño = posicionesDelArreglo;
        int resultado;
        /* COMPROBAMOS QUE ÉL TAMAÑO DEL NO SEA CERO, YA QUE SI EL TAMAÑO
        ES CERO INTENTARÁ EN LA SIGUIENTE LLAMADA ENTRAR EN LA POSICIÓN -1
        DEL ARRAY DANDO UN ERROR */
        if (tamaño == 0) {
            return ArregloDeNumeros[tamaño];
        } else {
            /* SI EL TAMAÑO NO ES IGUAL A CERO, AÑADIMOS AL RESULTADO
            LA SUMA DEL VALOR PASADO POR PARÁMETRO MÁS EL VALOR DE LA
            POSICIÓN ANTERIOR */
            resultado = (ArregloDeNumeros[tamaño]) + sumarValores(ArregloDeNumeros, tamaño - 1);
        }
        return resultado;
    }

    public static double potencia(int base, int exponente) {

        if (exponente == 0) { //caso base
            return 1; //10^0 = 1
        } else if (exponente == 1) { //caso base
            return base; //10^1 = 10
        } else if (exponente < 0) { //Exponente negativo
            return potencia(base, exponente + 1) / base;
        } else {  //Exponente positivo
            return base * potencia(base, exponente - 1);
        }

    }


    //SE IMPLEMENTA UN METODO RECURSIVO PARA TRANSFORMAR A BINARIO LA CIFRA
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

    public static int sumaRecursiva(int numero){
        int resultado = 0;

        if (numero == 1){  //Caso Base
            return 1;
        }else{
            resultado = numero + sumaRecursiva(numero-1); //Se llama asi mismo
        }

        return resultado;
    }

    public static int obtener_mcd(int numero1, int numero2) {
        if (numero2 == 0)
            return numero1;
        else
            return obtener_mcd(numero2, numero1 % numero2);
    }
}
