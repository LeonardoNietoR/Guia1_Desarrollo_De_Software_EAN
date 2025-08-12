public class Empresa {
    private String nombre;
    private String sector;
    private String correoElectronico;

    public Empresa(String nombre, String sector, String correoElectronico) {
        this.nombre = nombre;
        this.sector = sector;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() { return nombre; }
    public String getSector() { return sector; }
    public String getCorreoElectronico() { return correoElectronico; }

    @Override
    public String toString() {
        return "Empresa: " + nombre + " | Sector: " + sector + " | Correo: " + correoElectronico;
    }
}

