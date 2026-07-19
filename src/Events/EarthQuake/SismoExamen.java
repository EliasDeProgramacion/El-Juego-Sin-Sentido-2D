package sismos;
 import sismos.nivel_01.DatosNivel1;
 import sismos.nivel_02.DatosNivel2;
 import sismos.nivel_03.DatosNivel3;
 import sismos.nivel_04.DatosNivel4;
 import sismos.nivel_05.DatosNivel5;
 import sismos.nivel_06.DatosNivel6;
 import sismos.nivel_07.DatosNivel7;
 import sismos.nivel_08.DatosNivel8;
 import sismos.nivel_09.DatosNivel9;
 import sismos.nivel_10.DatosNivel10;
 import sismos.nivel_11.DatosNivel11;
 import sismos.nivel_12.DatosNivel12;
 import sismos.nivel_13.DatosNivel13;
 import sismos.nivel_14.DatosNivel14;
 import sismos.nivel_15.DatosNivel15;
 import sismos.nivel_16.DatosNivel16;
 import sismos.nivel_17.DatosNivel17;
 import sismos.nivel_18.DatosNivel18;
 public class PruebaSismos {
     public static void main(String[] args) {
         System.out.println("=====================================");
         System.out.println("   PRUEBA COMPLETA: ESCALA SÍSMICA   ");
         System.out.println("=====================================\n");
         SismoBase[] listaSismos = {
             DatosNivel1.obtener(),
             DatosNivel2.obtener(),
             DatosNivel3.obtener(),
             DatosNivel4.obtener(),
             DatosNivel5.obtener(),
             DatosNivel6.obtener(),
             DatosNivel7.obtener(),
             DatosNivel8.obtener(),
             DatosNivel9.obtener(),
             DatosNivel10.obtener(),
             DatosNivel11.obtener(),
             DatosNivel12.obtener(),
             DatosNivel13.obtener(),
             DatosNivel14.obtener(),
             DatosNivel15.obtener(),
             DatosNivel16.obtener(),
             DatosNivel17.obtener(),
             DatosNivel18.obtener()
         };
         double resistenciaRefugio = 50.0;
         for (SismoBase sismo : listaSismos) {
             sismo.mostrarInformacion();
             boolean ocurre = sismo.verificarSiOcurre();
             
             if (ocurre) {
                 System.out.println("✅ ESTE SISMO OCURRIRÍA");
                 double danio = sismo.calcularDanioRefugio(resistenciaRefugio);
                 System.out.println("⚡ Daño al refugio (resistencia " + resistenciaRefugio + "): " + danio);
             } else {
                 System.out.println("❌ ESTE SISMO NO OCURRE");
             }
             System.out.println("-------------------------------------\n");
         }
         System.out.println("✅ PRUEBA FINALIZADA: TODOS LOS NIVELES CARGADOS CORRECTAMENTE");
     }
 }
