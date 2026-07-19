package sismos.nivel_13;
 import sismos.SismoBase;
 public class DatosNivel13 {
     public static SismoBase obtener() {
         return new SismoBase(
             13,
             40,
             150.0,
             "Cataclismo-Medio",
             "Decenas de miles de años"
         );
     }
 }
