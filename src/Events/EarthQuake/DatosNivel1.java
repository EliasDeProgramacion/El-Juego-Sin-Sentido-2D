package sismos.nivel_01;
 import sismos.SismoBase;
 public class DatosNivel1 {
     public static SismoBase obtener() {
         return new SismoBase(
             1,
             100,
             3.0,
             "",
             "Horas"
         );
     }
 }
