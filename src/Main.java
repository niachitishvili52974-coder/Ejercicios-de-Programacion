import java.util.HashSet;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
import java.util.Set;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<String>porteros =new HashSet<>();
        Set<String>defensas=new HashSet<>();
        Set<String>centrocampistas=new HashSet<>();
        Set<String>delanteros=new HashSet<>();
        Scanner sc=new Scanner(System.in);

        int opcion;

        do{
            System.out.println("mercado de invierno");
            System.out.println("1.Alta jugador");
            System.out.println("2.Baja jugador");
            System.out.println("3.Modificar jugador");
            System.out.println("4.Mostrar todos");
            System.out.println("0.Salir");
            System.out.println("elige una opcion");
            opcion=sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Rol del jugador");
                    System.out.println("1.Portero");
                    System.out.println("2.Defensa");
                    System.out.println("3.Centrocampista");
                    System.out.println("4.Delantero");
                    opcion=sc.nextInt();
                    System.out.println("Elige rol:  ");
                    int rol=sc.nextInt();
                    Integer.parseInt(sc.nextLine());
                    System.out.println("Nombre del jugador a dar de alta: ");
                    String nombreAlta=sc.nextLine();
                    int rolAlta=Integer.parseInt(sc.nextLine());
                    if(rolAlta==1){
                        porteros.add(nombreAlta);
                    }else if(rolAlta==2) {
                        defensas.add(nombreAlta);
                    }else if(rolAlta==3){
                        centrocampistas.add(nombreAlta);
                    }else if(rolAlta==4){
                        delanteros.add(nombreAlta);
                    }else{
                        System.out.println("Rol no valido");
                    }
                    System.out.println("Operacion de alta terminada");
                    break;

                case 2:
                    System.out.println("Rol del jugador");
                    System.out.println("1.Portero");
                    System.out.println("2.Defensa");
                    System.out.println("3.Centrocampista");
                    System.out.println("4.Delantero");
                    opcion=sc.nextInt();
                    System.out.println("Elige rol:  ");
                    int rolBaja=sc.nextInt();
                    Integer.parseInt(sc.nextLine());
                    System.out.println("Nombre del jugador a dar de baja: ");
                    String nombreBaja=sc.nextLine();

                    if (rolBaja==1){
                        porteros.remove(nombreBaja);
                    }else if (rolBaja==2){
                        defensas.remove(nombreBaja);
                    }else if(rolBaja==3){
                        centrocampistas.remove(nombreBaja);
                    }else if(rolBaja==4){
                        delanteros.remove(nombreBaja);
                    }else{
                        System.out.println("rol no valido ");
                    }
                    System.out.println("Operacion de baja terminada");
                    break;


                case 3 :
                System.out.println("Rol Del jugador a modificar:");
                System.out.println("1. Portero");
                System.out.println("2. Defensa");
                System.out.println("3. Centrocampista");
                System.out.println("4. Delantero");
                    opcion=sc.nextInt();
                System.out.print("Elige rol: ");
                int rolMod = Integer.parseInt(sc.nextLine());
                System.out.print("Nombre actual del jugador: ");
                String nombreViejo = sc.nextLine();
                System.out.print("Nuevo nombre del jugador: ");
                String nombreNuevo = sc.nextLine();

                if (rolMod == 1) {
                    if (porteros.remove(nombreViejo)) {
                        porteros.add(nombreNuevo);
                        System.out.println("Jugador modificado.");
                    } else {
                        System.out.println("Ese jugador no existe en porteros.");
                    }
                } else if (rolMod == 2) {
                    if (defensas.remove(nombreViejo)) {
                        defensas.add(nombreNuevo);
                        System.out.println("Jugador modificado.");
                    } else {
                        System.out.println("Ese jugador no existe en defensas.");
                    }
                } else if (rolMod == 3) {
                    if (centrocampistas.remove(nombreViejo)) {
                        centrocampistas.add(nombreNuevo);
                        System.out.println("Jugador modificado.");
                    } else {
                        System.out.println("Ese jugador no existe en centrocampistas.");
                    }
                } else if (rolMod == 4) {
                    if (delanteros.remove(nombreViejo)) {
                        delanteros.add(nombreNuevo);
                        System.out.println("Jugador modificado.");
                    } else {
                        System.out.println("Ese jugador no existe en delanteros.");
                    }
                } else {
                    System.out.println("Rol no válido.");
                }
                break;

                case 4:
                    System.out.println(" Listado de jugadores");
                    System.out.println("Porteros:        " + porteros);
                    System.out.println("Defensas:        " + defensas);
                    System.out.println("Centrocampistas: " + centrocampistas);
                    System.out.println("Delanteros:      " + delanteros);
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default: System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }
}
