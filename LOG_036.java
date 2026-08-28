import java.util.Scanner;

public class LOG_036 {
    public static void main(String[] args) {
        String opciones;
        double porcentajeExelente;
        int exelente, regular, malo, total;
        exelente = 0;
        regular = 0;
        malo = 0;
        total=0;
        Scanner leer = new Scanner( System.in);
        do {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║     ENCUESTA DE CALIDAD              ║");
            System.out.println("║         DE SERVICIO                  ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║                                      ║");
            System.out.println("║   ┌─────────────────────────────┐    ║");
            System.out.println("║   │  ¿CÓMO CALIFICARÍA NUESTRO │     ║");
            System.out.println("║   │      SERVICIO?              │    ║");
            System.out.println("║   └─────────────────────────────┘    ║");
            System.out.println("║                                      ║");
            System.out.println("║   [1] ★★★★★  EXCELENTE            ║");
            System.out.println("║   [2] ★★★☆☆  REGULAR              ║");
            System.out.println("║   [3] ★☆☆☆☆  MALO                 ║");
            System.out.println("║   [4]   ❌   TERMINAR ENCUESTA       ║");
            System.out.println("║                                      ║");
            System.out.println("║   Ingrese su opción (1-4):           ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.println("");
            System.out.println("  ⏳ Por favor responda con sinceridad");
            System.out.println("     ¡Su opinión nos ayuda a mejorar!");
            opciones = leer.next().toLowerCase();
          }