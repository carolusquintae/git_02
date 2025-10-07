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