package sismos.nivel_09;
 import sismos.SismoBase;
 public class DatosNivel9 {
     public static SismoBase obtener() {
         return new SismoBase(
             9,
             60,
             100.0,
             "",
             "60 a 300 años"
         );
     }
 }
