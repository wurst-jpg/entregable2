import java.util.Scanner;

public class CAT_004 {
    public static void main(String[] args) {
        double DESCUENTO = 0.1;
        double IVA = 0.19;
        int opcion;
        double porcentajeTotalPremiun;
        int basico, medio, premiun;
        int totalItemns = 0;
        int total = 0;
        int contadorPremiun = 0;
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
            if (opcion == 1) {
                total += 50000;
                totalItemns++;
                System.out.println("producto basico agregado a la compra");
            } else if (opcion == 2) {
                total += 100000;
                System.out.println("producto medio agregado a la compra");
                totalItemns++;
            } else if (opcion == 3) {
                total += 150000;
                System.out.println("producto premiun agregado a la compra");
                contadorPremiun++;
                totalItemns++;
            }
        } while (opcion != 4);
        porcentajeTotalPremiun = (contadorPremiun * 100.0) / totalItemns;
        System.out.println(porcentajeTotalPremiun);
        System.out.println(total);
        System.out.println("saliste");
    }
}