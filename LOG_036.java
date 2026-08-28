import java.util.Scanner;

public class LOG_036 {
    public static void main(String[] args) {
        String opciones;
        double porcentajeExelente = 0;
        int exelente = 0, regular = 0, malo = 0, total = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║     ENCUESTA DE CALIDAD              ║");
            System.out.println("║         DE SERVICIO                  ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║   [1] ★★★★★  EXCELENTE            ║");
            System.out.println("║   [2] ★★★☆☆  REGULAR              ║");
            System.out.println("║   [3] ★☆☆☆☆  MALO                 ║");
            System.out.println("║   [4]   ❌   TERMINAR ENCUESTA      ║");
            System.out.println("║   Ingrese su opción (1-4):           ║");
            System.out.println("╚══════════════════════════════════════╝");
            opciones = leer.next().toLowerCase();

            switch (opciones) {
                case "1":
                    System.out.println("voto registrado gracias por tu voto");
                    exelente++;
                    total++;
                    break;
                case "2":
                    System.out.println("voto registrado gracias por tu voto");
                    regular++;
                    total++;
                    break;
                case "3":
                    System.out.println("voto registrado gracias por tu voto");
                    malo++;
                    total++;
                    break;
                case "4":
                    System.out.println("programa finalizado, gracias por tu voto");
                    break;  // ya no se cuenta malo/total aquí
                default:
                    System.out.println("opcion invalida. ingrese una opcion (1-2-3-4)");
                    break;
            }
        } while (!opciones.equals("4"));

        // Cálculo seguro al terminar: previene división por cero + casting a double
        if (total > 0) {
            porcentajeExelente = (exelente * 100) / (double) total;
        }

        if (porcentajeExelente >= 70) {
            System.out.println("Meta de satisfacción alcanzada");
        } else {
            System.out.println("Porcentaje de excelente: " + porcentajeExelente + "%");
        }
    }
}