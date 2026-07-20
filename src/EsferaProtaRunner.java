public class EsferaProtaRunner extends EsferaProta {
     public static final int TAMANIO = 8;
     public static final int PASO = 2;
     public int posicionX;
     public int posicionY;
     public EsferaProtaAvanzada() {
         super();
         posicionX = 0;
         posicionY = 0;
     }
     public void moverDerecha() {
         posicionX += PASO;
     }
     public void moverIzquierda() {
         posicionX -= PASO;
     }
     public void moverArriba() {
         posicionY -= PASO;
     }
     public void moverAbajo() {
         posicionY += PASO;
     }
 }
