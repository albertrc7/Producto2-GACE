package Modelo;

// Versió anterior on SocioEstandar no heredava de Socio
/*
public class SocioEstandar {
    private String nif;
    private Seguro seguro;

    public SocioEstandar() {}

    public SocioEstandar(String nif, Seguro seguro) {
        this.nif = nif;
        this.seguro = seguro;
    }

    // Aquí faltava herència de la classe Socio
}
*/

// Versió corregida amb herència de Socio
public class SocioEstandar extends Socio {
    private String nif;
    private Seguro seguro;

    // Constructor per defecte
    public SocioEstandar() {}

    // Constructor heretant atributs de Socio
    public SocioEstandar(String noSocio, String nombre, TipoSocio tipoSocio, String nif, Seguro seguro) {
        super(noSocio, nombre, tipoSocio);  // Inicialització d'atributs de Socio
        this.nif = nif;
        this.seguro = seguro;
    }

    // Getters i setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "SocioEstandar{" +
                "nif='" + nif + '\'' +
                ", seguro=" + seguro +
                ", noSocio='" + getNoSocio() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", tipoSocio='" + getTipoSocio() + '\'' +
                '}';
    }
}
