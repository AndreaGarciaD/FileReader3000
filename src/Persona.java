public class Persona {

    private String datosPersonales;
    private String[] datosFin;

    public Persona(String nombreCompleto) {
        this.datosPersonales = nombreCompleto;
        limpiarDatos();
    }

    public void limpiarDatos() {
        String[] pruebaDatos = datosPersonales.split(" ");
        this.datosFin = pruebaDatos;
    }

    public String toString() {
        return "Persona : " + datosPersonales;
    }

    public String getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(String datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public String[] getDatosFin() {
        return datosFin;
    }

    public void setDatosFin(String[] datosFin) {
        this.datosFin = datosFin;
    }
}
