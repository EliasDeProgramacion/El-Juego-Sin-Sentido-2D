public class EsferaProta {
     public static final int MAX_VIDA = 100;
     public static final int MAX_HAMBRE = 100;
     public static final int MAX_SED = 100;
     public int vida;
     public int hambre;
     public int sed;
     public EsferaProta() {
         vida = MAX_VIDA;
         hambre = MAX_HAMBRE;
         sed = MAX_SED;
     }
     public void pasarTiempo(int segundos) {
         hambre = Math.max(0, hambre - segundos / 5);
         sed = Math.max(0, sed - segundos / 3);
         if (hambre <= 0 || sed <= 0) {
             vida = Math.max(0, vida - segundos / 2);
         }
     }
     public void comer(int cantidad) {
         hambre = Math.min(MAX_HAMBRE, hambre + cantidad);
     }
     public void beber(int cantidad) {
         sed = Math.min(MAX_SED, sed + cantidad);
     }
     public void curar(int cantidad) {
         vida = Math.min(MAX_VIDA, vida + cantidad);
     }
     public void mostrarEstado() {
         System.out.println("\n--- ESTADO DE LA ESFERA PROTA ---");
         System.out.println("Vida: " + vida + "/" + MAX_VIDA);
         System.out.println("Hambre: " + hambre + "/" + MAX_HAMBRE);
         System.out.println("Sed: " + sed + "/" + MAX_SED);
         System.out.println("----------------------------------");
     }
}
