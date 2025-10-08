
import java.util.Scanner;

/*
    Esta código muestra un menú interactivo en el que el usuario puede convertir diferentes unidades de longitud.
    Puede pasar de kilómetros a metros, de metros a centímetros, de kilómetros a yardas y de metros a millas.
 */
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
                    double km = pedirKilometros(sc);
                    kmAMetros(km);
                }

                case "2" -> {
                    double m = pedirMetros(sc);
                    metrosACm(m);
                }

                case "3" -> {
                    double km = pedirKilometros(sc);
                    kmAYardas(km);
                }

                case "4" -> {
                    double m = pedirMetros(sc);
                    metrosAMillas(m);
                }

                case "5" -> {
                    System.out.println("Saliendo del programa...");
                }

                default -> {
                    double km = pedirKilometros(sc);
                    double m = pedirMetros(sc);
                    calcularTodo(km, m);
                }
            }
        } while (!opcion.equals("5"));

        sc.close();
    }

    public static double pedirKilometros(Scanner scanner) {
        System.out.print("Ingresa kilómetros: ");
        return scanner.nextDouble();
    }

    public static double pedirMetros(Scanner scanner) {
        System.out.print("Ingresa metros: ");
        return scanner.nextDouble();
    }

    public static void calcularTodo(double km, double metros) {
        System.out.println("\n--- RESULTADOS ---");
        kmAMetros(km);
        metrosACm(metros);
        kmAYardas(km);
        metrosAMillas(metros);
    }

    // Métodos para el menú
    public static void kmAMetros(double km) {
        System.out.println(km + " km = " + (km * 1000) + " metros");
    }

    public static void metrosACm(double metros) {
        System.out.println(metros + " metros = " + (metros * 100) + " cm");
    }

    public static void kmAYardas(double km) {
        System.out.println(km + " km = " + (km * 1093.61) + " yardas");
    }

    public static void metrosAMillas(double metros) {
        System.out.println(metros + " metros = " + (metros * 0.000621371) + " millas");
    }
}
