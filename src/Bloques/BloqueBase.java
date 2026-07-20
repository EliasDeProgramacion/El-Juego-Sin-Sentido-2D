package bloques;

public class BloqueBase {
    public static final int TAMANIO_BASE = 8;

    public String nombre;
    public int ancho;
    public int alto;
    public boolean esBloqueGrande;
    public boolean esSolido;
    public boolean sePuedeRomper;
    public String herramientaNecesaria;
    public String recursoBase;
    public String recursoExtra;
    public int probabilidadExtra;
    public String afectadoPorClima;
    public String idImagen;
    public BloqueBase(String nombre, int ancho, int alto, boolean esSolido, boolean sePuedeRomper, String herramientaNecesaria, String recursoBase, String recursoExtra, int probabilidadExtra, String afectadoPorClima, String idImagen) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.esBloqueGrande = (ancho > TAMANIO_BASE) || (alto > TAMANIO_BASE);
        this.esSolido = esSolido;
        this.sePuedeRomper = sePuedeRomper;
        this.herramientaNecesaria = herramientaNecesaria;
        this.recursoBase = recursoBase;
        this.recursoExtra = recursoExtra;
        this.probabilidadExtra = probabilidadExtra;
        this.afectadoPorClima = afectadoPorClima;
        this.idImagen = idImagen;
    }
}
