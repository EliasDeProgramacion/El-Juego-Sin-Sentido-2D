import java.util.Scanner;
 public class Main {
     static Scanner teclado = new Scanner(System.in);
     static EsferaProta prota;
     public static void main(String[] args) {
         System.out.println("=====================================");
         System.out.println("        EL JUEGO SIN SENTIDO 2D      ");
         System.out.println("=====================================");
         System.out.println();
         mostrarMenu();
     }
     static void mostrarMenu() {
         int opcion;
         do {
             System.out.println("\n------------ MENÚ PRINCIPAL ------------");
             System.out.println("1.   Empezar nueva aventura");
             System.out.println("2.   Ver la historia");
             System.out.println("3.   Salir del juego");
             System.out.println("----------------------------------------");
             System.out.print("Elige una opción (1, 2 o 3): ");
             
             while (!teclado.hasNextInt()) {
                 System.out.print("Escribe un número válido: ");
                 teclado.next();
             }
             opcion = teclado.nextInt();
             teclado.nextLine();
             switch (opcion) {
                 case 1:
                     empezarJuego();
                     break;
                 case 2:
                     verHistoria();
                     break;
                 case 3:
                     System.out.println("\n ¡Hasta luego! Vuelve cuando quieras");
                     break;
                 default:
                     System.out.println(" Ese número no está en el menú, intenta de nuevo.");
             }
         } while (opcion != 3);
     }
     static void empezarJuego() {
         System.out.println("\n ¡La Esfera Prota empieza su viaje!");
         System.out.println("Cargando mundo...");
         
         prota = new EsferaProta();
         
         System.out.println("\n ¡Todo listo! Estás en el Valle Vacío, Ronda 1");
         System.out.println("Tu misión: construir tu primer refugio.");
         
         System.out.println("\n (Aquí vendrá la partida cuando terminemos los archivos)");
     }
     static void verHistoria() {
         System.out.println("\n------------ LA HISTORIA ------------");
         System.out.println("Soy la Esfera Prota. Por fin junté todo para comprar mi casa...");
         System.out.println("Pero mi tataratatarabuelo, el REY PLANETA ESFERA, se la llevó.");
         System.out.println("descubrir la verdad y recuperar mi casa... ¡o hacer una mejor!");
         System.out.println("--------------------------------------");
     }
