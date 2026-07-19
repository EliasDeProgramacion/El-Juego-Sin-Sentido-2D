public class EsferaProta {
     public static final int MAX_VIDA = 100;
     public static final int MAX_HAMBRE = 100;
     public static final int MAX_SED = 100;
     public int vida;
     public int hambre;
     public int sed;
     public double resistenciaRefugio;
     public boolean tieneAislamientoMagnetico;
     public EsferaProta() {
         vida = MAX_VIDA;
         hambre = MAX_HAMBRE;
         sed = MAX_SED;
         resistenciaRefugio = 50.0;
         tieneAislamientoMagnetico = false;
     }
     public void pasarTiempo(int minutosJuego) {
         hambre = Math.max(0, hambre - minutosJuego / 2);
         sed = Math.max(0, sed - minutosJuego / 1);
         if (hambre <= 0 || sed <= 0) {
             vida = Math.max(0, vida - minutosJuego / 3);
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
     public void activarAislamientoMagnetico() {
         tieneAislamientoMagnetico = true;
         resistenciaRefugio += 35.0;
         System.out.println("🛡️ Aislamiento Magnético ACTIVADO: resistencia aumentada a " + resistenciaRefugio);
     }
     public void recibirDañoPorSismo(double energiaSismo) {
         double danioBruto = energiaSismo * 0.5;
         double danioFinal = Math.max(0, danioBruto - resistenciaRefugio);
         if (tieneAislamientoMagnetico) {
             danioFinal = danioFinal * 0.3;
         }
         if (danioFinal > 0) {
             vida = (int) Math.max(0, vida - danioFinal);
             System.out.println("⚠️ Recibiste " + Math.round(danioFinal) + " puntos de daño por el sismo");
         } else {
             System.out.println("✅ Tu refugio resistió completamente el sismo");
         }
     }
     public void mostrarEstado() {
         System.out.println("\n--- ESTADO DE LA ESFERA PROTA ---");
         System.out.println("Vida: " + vida + "/" + MAX_VIDA);
         System.out.println("Hambre: " + hambre + "/" + MAX_HAMBRE);
         System.out.println("Sed: " + sed + "/" + MAX_SED);
         System.out.println("Resistencia del refugio: " + resistenciaRefugio);
         System.out.println("Aislamiento Magnético: " + (tieneAislamientoMagnetico ? "ACTIVO" : "INACTIVO"));
         System.out.println("----------------------------------");
     }
}
