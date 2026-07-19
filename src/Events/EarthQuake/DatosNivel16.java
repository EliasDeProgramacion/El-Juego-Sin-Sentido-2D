package sismos.nivel_16;
 import sismos.SismoBase;
 public class DatosNivel16 {
     public static SismoBase obtener() {
         return new SismoBase(
             16,
             25,
             180.0,
             "Cataclismo Mayor-Extremo",
             "Un millon de años"
         );
     }
 }
