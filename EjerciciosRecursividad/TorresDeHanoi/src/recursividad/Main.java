package recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main objetoHanoi = new Main();
        Scanner entrada = new Scanner(System.in);
        int numeroDeDiscos;
        System.out.println("Ingrese el numero de discos iniciales: ");
        numeroDeDiscos = entrada.nextInt();
        objetoHanoi.torresHanoi(numeroDeDiscos,1,2,3);
        System.out.println("Juego completado");
    }

    //Metodo recursivo para solucionar las Torres de Hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        //Caso base
        if (discos == 1){
            System.out.println("Mover Disco de Torre" + torre1 + "a Torre" + torre3);
        }else {
            //Dominio
            torresHanoi(discos-1, torre1, torre3, torre2);  //numero de discos este es -1 ya que se le a quitado un disco, torre inicio, torre destino y torre auxiliar
            System.out.println("Mover Disco de Torre" + torre1 + "a Torre" + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }

    }

    //http://www.disfrutalasmatematicas.com/juegos/torre-de-hanoi-2.html
    //Compare resultados  del juego del link con el del codigo
}
