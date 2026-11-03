
package POOShowcaseActividad;

import java.io.Serializable;

// Guarda los datos de cada concepto de programación.
public class Concepto implements Serializable {

    private int idConcepto;
    private String concepto;
    private String descripcion;
    private String[] etiquetas;
    private String enlaceReplit;

    // Crea un concepto con todos sus datos.
    public Concepto(int idConcepto, String concepto,
                    String descripcion, String[] etiquetas,
                    String enlaceReplit) {

        this.idConcepto = idConcepto;
        this.concepto = concepto;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.enlaceReplit = enlaceReplit;
    }

    // También permite crear conceptos sin enlace.
    public Concepto(int idConcepto, String concepto,
                    String descripcion, String[] etiquetas) {

        this(idConcepto, concepto, descripcion, etiquetas, "");
    }

    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String[] etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getEnlaceReplit() {
        return enlaceReplit;
    }

    public void setEnlaceReplit(String enlaceReplit) {
        this.enlaceReplit = enlaceReplit;
    }

    // Convierte una línea de texto en un concepto.
    public static Concepto fromString(String texto) {

        String[] datos = texto.split("\\|", -1);

        if (datos.length < 4) {
            throw new IllegalArgumentException(
                "Faltan datos del concepto."
            );
        }

        int id = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        String descripcion = datos[2];
        String[] etiquetas = datos[3].split(",");

        String enlace = "";

        if (datos.length > 4) {
            enlace = datos[4];
        }

        return new Concepto(
            id, nombre, descripcion, etiquetas, enlace
        );
    }
}
