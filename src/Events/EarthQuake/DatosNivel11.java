package sismos.nivel_11;
 import sismos.SismoBase;
 public class DatosNivel11 {
     public static SismoBase obtener() {
         return new SismoBase(
             11,
             50,
             120.0,
             "Cataclismo Menor",
             "1000 años"
         );
     }
 }
