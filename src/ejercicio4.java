import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AgendaMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> contactos = new HashMap<>();
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero(sc, "Elige opción: ");
            switch (opcion) {
                case 1 : anadirNuevoNumero(sc, contactos);
                case 2 : borrarNumero(sc, contactos);
                case 3 : buscarNumero(sc, contactos);
                case 4 : borrarPorNombre(sc, contactos);
                case 5 : buscarPorNombre(sc, contactos);
                case 6 : System.out.println("Saliendo...");
                default: System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        sc.close();
    }
    static void mostrarMenu() {
        System.out.println("Menu agenda (map)");
        System.out.println("1.Anadir un nuevo numero (por nombre)");
        System.out.println("2.Borrar un numero (por telefono)");
        System.out.println("3.Buscar un número (por telefono)");
        System.out.println("4.Borrar por nombre");
        System.out.println("5.Buscar por nombre");
        System.out.println("6.Salir");
    }

    static void anadirNuevoNumero(Scanner sc, Map<String, String> contactos) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Telefono: ");
        String telefono = sc.nextLine().trim();
        String anterior = contactos.put(nombre, telefono);

        if (anterior == null) {
            System.out.println("Contacto anadido.");
        } else {
            System.out.println("Contacto actualizado. Telefono anterior: " + anterior);
        }
    }

    static void borrarPorNombre(Scanner sc, Map<String, String> contactos) {
        System.out.print("Nombre a borrar: ");
        String nombre = sc.nextLine().trim();

        if (contactos.containsKey(nombre)) {
            String tel = contactos.remove(nombre);
            System.out.println("Borrado: " + nombre + " -" + tel);
        } else {
            System.out.println("No existe ese nombre.");

    }
}