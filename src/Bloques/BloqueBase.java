package bloques;
 public class BloqueBase {
     public static final int TAMANIO_BLOQUE = 8;
     public String nombre;
     public boolean esSolido;
     public boolean tieneRecurso;
     public String idGrafico;
     public BloqueBase(String nombre, boolean esSolido, boolean tieneRecurso, String idGrafico) {
         this.nombre = nombre;
         this.esSolido = esSolido;
         this.tieneRecurso = tieneRecurso;
         this.idGrafico = idGrafico;
     }
 }
