import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== RESTAURANTE =====");
            System.out.println("1. Gestión de mesas");
            System.out.println("2. Gestión del menú");
            System.out.println("3. Gestión de pedidos");
            System.out.println("4. Facturación");
            System.out.println("5. Consultas");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Gestión de mesas");
                    break;

                case 2:
                    System.out.println("Gestión del menú");
                    break;

                case 3:
                    System.out.println("Gestión de pedidos");
                    break;

                case 4:
                    System.out.println("Facturación");
                    break;

                case 5:
                    System.out.println("Consultas");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");

            }

        } while (opcion != 0);

        teclado.close();
    }
}