package bloques;
 public class BloqueBase {
     public static final int TAMANIO_BLOQUE = 8;
     public String nombre;
     public boolean esSolido;
     public boolean tieneRecurso;
     public String idGrafico;
     public BloqueBase(String nombre, boolean esSolido, boolean tieneRecurso, String idGrafico) {
         this.nombre = nombre;
         this.ancho = ancho;
         this.alto = alto;
         this.esBloqueGrande = (ancho > TAMANIO_BASE || alto > TAMANIO_BASE);         this.esSolido = esSolido;
         this.sePuedeRomper = sePuedeRomper;
         this.herramientaNecesaria = herramientaNecesaria;
         this.tieneRecurso = tieneRecurso;
         this.idGrafico = idGrafico;
     }
 }
