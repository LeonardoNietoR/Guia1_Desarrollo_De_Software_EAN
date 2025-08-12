public class Stand {
    private int numeroUnico;
    private String ubicacion;
    private double tamano;

    public Stand(int numeroUnico, String ubicacion, double tamano) {
        this.numeroUnico = numeroUnico;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
    }

    public int getNumeroUnico() { return numeroUnico; }
    public String getUbicacion() { return ubicacion; }
    public double getTamano() { return tamano; }

    @Override
    public String toString() {
        return "Stand #" + numeroUnico + " | Ubicación: " + ubicacion + " | Tamaño: " + tamano + " m²";
    }
}
