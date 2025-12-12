import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ProductosCaducidad {
    public static void main(String[] args) {
        Queue<LocalDate> fechas = new LinkedList<>();
        Queue<String> productos = new LinkedList<>();

        fechas.add(LocalDate.of(2025, 3, 10));
        productos.add("Leche");

        fechas.add(LocalDate.of(2025, 1, 5));
        productos.add("Yogur");

        fechas.add(LocalDate.of(2025, 12, 31));
        productos.add("Queso");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una fecha límite (yyyy-MM-dd): ");
        LocalDate limite = LocalDate.parse(sc.nextLine());
        System.out.println("Productos antes de eliminar: ");
        mostrarColas(fechas, productos);

        int eliminados = 0;
        while (!fechas.isEmpty() && fechas.peek().isBefore(limite)) {
            fechas.poll();
            productos.poll();
            eliminados++;
        }

        System.out.println("Se han eliminado " + eliminados + " productos caducados.");
        System.out.println("Productos despues de eliminar:");
        mostrarColas(fechas, productos);
    }
    private static void mostrarColas(Queue<LocalDate> fechas, Queue<String> productos) {
        Object[] f = fechas.toArray();
        Object[] p = productos.toArray();

        if (f.length == 0) {
            System.out.println("No quedan productos en la cola");
            return;
        }
        for (int i = 0; i < f.length; i++) {
            System.out.println(p[i] + " caduca el " + f[i]);
        }
    }
}
