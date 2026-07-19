package sismos.nivel_14;
 import sismos.SismoBase;
 public class DatosNivel14 {
     public static SismoBase obtener() {
         return new SismoBase(
             14,
             35,
             160.0,
             "Cataclismo Mayor",
             "Cincuentos de miles de años"
         );
     }
 }
