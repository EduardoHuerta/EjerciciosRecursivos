package recursividad;

public class Main {

    public static void main(String[] args) {
	int num = 9;
	int resultado = sumaRecursiva(num);
        System.out.println(resultado);

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
}
