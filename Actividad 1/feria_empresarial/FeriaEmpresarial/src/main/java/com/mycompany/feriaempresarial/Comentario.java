import java.time.LocalDate;

public class Comentario {
    private String nombreVisitante;
    private LocalDate fecha;
    private int calificacion;
    private String comentario;

    public Comentario(String nombreVisitante, LocalDate fecha, int calificacion, String comentario) {
        this.nombreVisitante = nombreVisitante;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public String getNombreVisitante() { return nombreVisitante; }
    public LocalDate getFecha() { return fecha; }
    public int getCalificacion() { return calificacion; }
    public String getComentario() { return comentario; }

    @Override
    public String toString() {
        return "[" + fecha + "] " + nombreVisitante + " (" + calificacion + "/5): " + comentario;
    }
}
