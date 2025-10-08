
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
import java.util.Scanner;

public class ConversorUnidades {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Por ahora ejecuta todo directamente
        double km = pedirKilometros(scanner);
        double metros = pedirMetros(scanner);
        calcularTodo(km, metros);
        
        scanner.close();
    }
    
    // Estos métodos se usarán cuando haya menú
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
        System.out.println(km + " km = " + (km * 1000) + " metros");
        System.out.println(metros + " metros = " + (metros * 100) + " cm");
        System.out.println(km + " km = " + (km * 1093.61) + " yardas");
        System.out.println(metros + " metros = " + (metros * 0.000621371) + " millas");
    }
    
    // Para el menú futuro:
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
