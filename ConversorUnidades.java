
import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {
        String opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n=== Conversor de unidades ===");
            System.out.println("1. Pasar de kilometros a metros");
            System.out.println("2. Pasar de metros a centimetros");
            System.out.println("3. Pasar de kilometros a yardas");
            System.out.println("4. Pasar de metros a millas");
            System.out.println("5. Salir\n");

            System.out.println("Introduce una opcion");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> {
                }

                case "2" -> {
                }

                case "3" -> {
                }

                case "4" -> {
                }

                case "5" ->
                    System.out.println("Saliendo del programa...");

                default ->
                    System.out.println("Opción inválida");
            }
        } while (!opcion.equals("5"));

        sc.close();
    }
}
