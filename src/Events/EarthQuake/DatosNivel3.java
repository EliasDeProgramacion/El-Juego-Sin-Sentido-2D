package sismos.nivel_03;
 import sismos.SismoBase;
 public class DatosNivel3 {
     public static SismoBase obtener() {
         return new SismoBase(
             3,
             90,
             12.0,
             "",
             "3 a 4 horas"
         );
     }
 }
