import java.time.LocalDate;
import java.util.Scanner;

public class MainFeriaEmpresarial {
    public static void main(String[] args) {
        FeriaEmpresarial feria = new FeriaEmpresarial();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Feria Empresarial ---");
            System.out.println("1. Registrar Empresa");
            System.out.println("2. Registrar Stand");
            System.out.println("3. Registrar Visitante");
            System.out.println("4. Registrar Comentario");
            System.out.println("5. Ver Reporte de Empresas");
            System.out.println("6. Ver Reporte de Stands");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la empresa: ");
                    String nombreE = sc.nextLine();
                    System.out.print("Sector: ");
                    String sector = sc.nextLine();
                    System.out.print("Correo electrónico: ");
                    String correoE = sc.nextLine();
                    feria.registrarEmpresa(new Empresa(nombreE, sector, correoE));
                    System.out.println("✅ Empresa registrada.");
                    break;

                case 2:
                    System.out.print("Número único del stand: ");
                    int num = sc.nextInt(); sc.nextLine();
                    System.out.print("Ubicación: ");
                    String ubicacion = sc.nextLine();
                    System.out.print("Tamaño (m²): ");
                    double tamano = sc.nextDouble();
                    feria.registrarStand(new Stand(num, ubicacion, tamano));
                    System.out.println("✅ Stand registrado.");
                    break;

                case 3:
                    System.out.print("Nombre del visitante: ");
                    String nombreV = sc.nextLine();
                    System.out.print("Identificación: ");
                    String id = sc.nextLine();
                    System.out.print("Correo electrónico: ");
                    String correoV = sc.nextLine();
                    feria.registrarVisitante(new Visitante(nombreV, id, correoV));
                    System.out.println("✅ Visitante registrado.");
                    break;

                case 4:
                    System.out.print("Nombre del visitante: ");
                    String nv = sc.nextLine();
                    System.out.print("Calificación (1-5): ");
                    int cal = sc.nextInt(); sc.nextLine();
                    System.out.print("Comentario: ");
                    String com = sc.nextLine();
                    feria.registrarComentario(new Comentario(nv, LocalDate.now(), cal, com));
                    System.out.println("✅ Comentario registrado.");
                    break;

                case 5:
                    feria.generarReporteEmpresas();
                    break;

                case 6:
                    feria.generarReporteStands();
                    break;

                case 0:
                    System.out.println("👋 Saliendo del sistema...");
                    break;

                default:
                    System.out.println("⚠ Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
