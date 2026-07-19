package sismos.nivel_01;
 import sismos.SismoBase;
 public class DatosNivel1 {
     public static SismoBase obtener() {
         return new SismoBase(
             1,
             100,
             3.0,
             "",
             "Horas",
             "Casi nadie lo siente; activa aparatos electrónicos solos sin causar daños."
         );
     }
 }
