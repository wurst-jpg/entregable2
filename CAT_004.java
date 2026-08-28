import java.util.Scanner;

public class CAT_004 {
    public static void main(String[] args) {
        double DESCUENTO = 0.1;
        double IVA = 0.19;
        String opcion;
        double porcentajeTotalPremiun;
        int basico, medio, premiun;
        double totalIva;
        int totalItemns = 0;
        double total = 0;
        int contadorPremiun = 0;
        basico = 50000;
        medio = 100000;
        premiun = 150000;
        Scanner leer = new Scanner(        System.in);

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
            opcion = leer.nextLine().toLowerCase();
            if (opcion.equals("1")) {
                total += 50000;
                totalItemns++;
                        System.out.println("producto basico agregado a la compra");
            } else if (opcion.equals("2")) {
                total += 100000;
                        System.out.println("producto medio agregado a la compra");
                totalItemns++;
            } else if (opcion.equals("3")) {
                total += 150000;
                        System.out.println("producto premiun agregado a la compra");
                contadorPremiun++;
                totalItemns++;
            } else if (opcion.equals("4")) {
            } else {
                System.out.println("ingrese un numero del 1 al 4");
            }
        } while (!opcion.equals("4"));
        if (total > 100000) {
              total = total -(total * DESCUENTO);
             
        }
        totalIva = (total * IVA ) + total;

        if (total > 0) {
            porcentajeTotalPremiun = (contadorPremiun * 100.0) / totalItemns;
        }else{
            porcentajeTotalPremiun = 0;
        }
        System.out.println("===================================");
        System.out.println("          FACTURA FINAL            ");
        System.out.println("===================================");
        System.out.println("Total con descuento: $" + total);
        System.out.println("IVA (19%): $" + (total * IVA));
        System.out.println("Total a pagar: $" + totalIva);
        System.out.println("% Premium vendidos: " + porcentajeTotalPremiun + "%");
        System.out.println("===================================");
    }
}
