package sismos;
 public class SismoBase {
     public int nivel;
     public int probabilidad;
     public double energia;
     public String nombre;
     public String duracion;
     public SismoBase(int nivel, int probabilidad, double energia, String nombre, String duracion,) {
         this.nivel = nivel;
         this.probabilidad = probabilidad;
         this.energia = energia;
         this.nombre = nombre;
         this.duracion = duracion;
     }
     public boolean verificarSiOcurre() {
         int numeroAleatorio = (int)(Math.random() * 101);
         return numeroAleatorio <= probabilidad;
     }
     public double calcularDanioRefugio(double resistencia) {
         double danioBruto = energia * 0.5;
         double danioFinal = Math.max(0, danioBruto - resistencia);
         return danioFinal;
     }
     public void mostrarInformacion() {
         System.out.println("\n====================================");
         System.out.println("SISMO NIVEL " + nivel);
         if (!nombre.isEmpty()) {
             System.out.println("Nombre: " + nombre);
         }
         System.out.println("Probabilidad: " + probabilidad + "%");
         System.out.println("Energía: " + energia + " V");
         System.out.println("Duración: " + duracion);
         System.out.println("====================================");
     }
 }
