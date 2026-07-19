package sismos.nivel_10;
 import sismos.SismoBase;
 public class DatosNivel10 {
     public static SismoBase obtener() {
         return new SismoBase(
             10,
             55,
             115.0,
             "",
             "300 a 700 años"
         );
     }
 }
