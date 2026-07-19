package sismos.nivel_12;
 import sismos.SismoBase;
 public class DatosNivel12 {
     public static SismoBase obtener() {
         return new SismoBase(
             12,
             45,
             130.0,
             "Cataclismo Medio",
             "4000 años"
         );
     }
 }
