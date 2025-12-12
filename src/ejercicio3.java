import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PilaLibrosBiblioteca {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Gestion de pila de libros");
        System.out.println("1.Ejecutar usando Stack");
        System.out.println("2.Ejecutar usando Deque");
        System.out.println("Elige opcion:  ");

        int modo=leerEntero(sc);

        if (modo == 1) {
            ejecutarConStack(sc);
        }else if (modo == 2) {
            ejecutarConDeque(sc);
        }else{
            System.out.println("opcion no valida");
        }
        sc.close();


        public static void ejecutarConStack(sc)


    }
}
