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

