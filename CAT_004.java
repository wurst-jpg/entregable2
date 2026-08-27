import java.util.Scanner;

public class CAT_004 {
    public static void main(String[] args) {
        double DESCUENTO = 0.1;
        double IVA = 0.19;
        int opcion;
        int basico, medio, premiun;
        basico = 50000;
        medio = 100000;
        premiun = 150000;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("╔══════════════════════════════════╗\n" + //
                                "║     CATALOGO LOCAL - CAJA #1     ║\n" + //
                                "╠══════════════════════════════════╣\n" + //
                                "║  1. Basico      - $50.000        ║\n" + //
                                "║  2. Medio       - $100.000       ║\n" + //
                                "║  3. Premium     - $150.000       ║\n" + //
                                "║  4. Finalizar compra             ║\n" + //
                                "╚══════════════════════════════════╝");
            System.out.print("  Seleccione una opcion: ");
            opcion = leer.nextInt();
            System.out.println("no saliste");
        } while (opcion != 4); 
        
        
        System.out.println("saliste");
    }
    
}

