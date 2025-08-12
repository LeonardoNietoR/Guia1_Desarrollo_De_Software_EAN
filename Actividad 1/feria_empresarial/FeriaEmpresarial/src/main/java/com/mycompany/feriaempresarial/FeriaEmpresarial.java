import java.util.ArrayList;
import java.util.List;

public class FeriaEmpresarial {
    private List<Empresa> empresas;
    private List<Stand> stands;
    private List<Visitante> visitantes;
    private List<Comentario> comentarios;

    public FeriaEmpresarial() {
        empresas = new ArrayList<>();
        stands = new ArrayList<>();
        visitantes = new ArrayList<>();
        comentarios = new ArrayList<>();
    }

    public void registrarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public void registrarStand(Stand stand) {
        stands.add(stand);
    }

    public void registrarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public void registrarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void generarReporteEmpresas() {
        System.out.println("=== Lista de Empresas ===");
        empresas.forEach(System.out::println);
    }

    public void generarReporteStands() {
        System.out.println("=== Lista de Stands ===");
        stands.forEach(System.out::println);
    }
}
