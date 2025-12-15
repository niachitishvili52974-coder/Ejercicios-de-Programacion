import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

class PilaLibrosBiblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gestion de pila de libros");
        System.out.println("1.Ejecutar usando Stack");
        System.out.println("2.Ejecutar usando Deque (ArrayDeque)");
        System.out.print("Elige opcion: ");
        int modo = leerEntero(sc);
        if (modo == 1) {
            ejecutarConStack(sc);
        } else if (modo == 2) {
            ejecutarConDeque(sc);
        } else {
            System.out.println("Opcion no valida. Saliendo");
        }
        sc.close();
    }


    private static void ejecutarConStack(Scanner sc) {
        Stack<String> pila = new Stack<>();
        int opcion;

        do {
            mostrarMenu("Stack");
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1 : {
                    System.out.print("Introduce el titulo del libro: ");
                    String titulo = sc.nextLine();
                    pila.push(titulo);
                    System.out.println("Anadido: " + titulo);
                }
                case 2 : {
                    if (pila.isEmpty()) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("Libro en la parte superior: " + pila.peek());
                    }
                }
                case 3 : {
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía. No se puede retirar.");
                    } else {
                        String retirado = pila.pop();
                        System.out.println("Libro retirado: " + retirado);
                    }
                }
                case 4 : {
                    if (pila.isEmpty()) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("Libros mas reciente - mas antiguo:  ");
                        for (int i = pila.size() - 1; i >= 0; i--) {
                            System.out.println(" - " + pila.get(i));
                        }
                    }
                }
                case 5 : {
                    System.out.println(pila.isEmpty() ? "La pila esta vacia." : "La pila no esta vacia.");
                }
                case 0: System.out.println("Saliendo del modo Stack...");
                default : System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }

    private static void ejecutarConDeque(Scanner sc) {
        Deque<String> pila = new ArrayDeque<>();
        int opcion;

        do {
            mostrarMenu("Deque (ArrayDeque)");
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1 : {
                    System.out.print("Introduce el titulo del libro: ");
                    String titulo = sc.nextLine();
                    pila.push(titulo);
                    System.out.println("Anadido: " + titulo);
                }
                case 2 : {
                    if (pila.isEmpty()) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("Libro en la parte superior: " + pila.peek());
                    }
                }
                case 3 : {
                    if (pila.isEmpty()) {
                        System.out.println("La pila esta vacia.No se puede retirar");
                    } else {
                        String retirado = pila.pop();
                        System.out.println("Libro retirado: " + retirado);
                    }
                }
                case 4 : {
                    if (pila.isEmpty()) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("Libros mas reciente - mas antiguo:  ");
                        Iterator<String> it = pila.iterator();
                        while (it.hasNext()) {
                            System.out.println(" - " + it.next());
                        }
                    }
                }
                case 5 : {
                    System.out.println(pila.isEmpty() ? "La pila esta vacia." : "La pila no esta vacia.");
                }
                case 0 : System.out.println("Saliendo del modo Deque...");
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }
    private static void mostrarMenu(String tipo) {
        System.out.println(" Menu (" + tipo + ") ");
        System.out.println("1.Anadir un libro a la pila");
        System.out.println("2.Consultar el libro en la parte superior");
        System.out.println("3.Retirar el libro en la parte superior");
        System.out.println("4.Mostrar todos los libros en la pila");
        System.out.println("5.Verificar si la pila esta vacia");
        System.out.println("0.Salir");
        System.out.print("Elige una opcion: ");
    }

    private static int leerEntero(Scanner sc) {
        while (true) {
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.print("Introduce un numero valido: ");
            }
        }
    }
}