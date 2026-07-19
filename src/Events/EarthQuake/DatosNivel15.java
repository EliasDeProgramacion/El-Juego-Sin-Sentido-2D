package sismos.nivel_15;
 import sismos.SismoBase;
 public class DatosNivel15 {
     public static SismoBase obtener() {
         return new SismoBase(
             15,
             30,
             170.0,
             "Cataclismo Mayor",
             "Cientos de Miles de Años"
         );
     }
 }
