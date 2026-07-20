package clima;
 public class ClimaBase {
     public String nombre;
     public int duracionMinima;
     public int duracionMaxima;
     public int probabilidadAparecer;
     public boolean afectaMovimiento;
     public boolean afectaRecursos;
     public String descripcionEfecto;
     public ClimaBase(String nombre, int duracionMinima, int duracionMaxima, int probabilidadAparecer, boolean afectaMovimiento, boolean afectaRecursos, String descripcionEfecto) {
         this.nombre = nombre;
         this.duracionMinima = duracionMinima;
         this.duracionMaxima = duracionMaxima;
         this.probabilidadAparecer = probabilidadAparecer;
         this.afectaMovimiento = afectaMovimiento;
         this.afectaRecursos = afectaRecursos;
         this.descripcionEfecto = descripcionEfecto;
     }
     public int calcularDuracionAleatoria() {
         return (int)(Math.random() * (duracionMaxima - duracionMinima + 1)) + duracionMinima;
     }
     public boolean intentarAparecer() {
         int numero = (int)(Math.random() * 101);
         return numero <= probabilidadAparecer;
     }
     public void mostrarInformacion() {
         System.out.println("\n--- CLIMA: " + nombre + " ---");
         System.out.println("Duración: " + duracionMinima + " a " + duracionMaxima + " minutos de juego");
         System.out.println("Probabilidad: " + probabilidadAparecer + "%");
         System.out.println("Efecto: " + descripcionEfecto);
         System.out.println("----------------------------");
     }
 }
