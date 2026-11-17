public class Main {

    public static void main(String[] args) {

        Proyecto proyecto = new Proyecto("Sistema de ventas");

        System.out.println("Proyecto recién creado:");
        System.out.println(proyecto.mostrarEquipo());

        Desarrollador d1 = new Desarrollador("D01", "Julia", "Backend", 20);
        Desarrollador d2 = new Desarrollador("D23", "Naty", "Frontend", 15);
        Desarrollador d3 = new Desarrollador("D13", "Carlos", "Full Stack", 25);

        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        System.out.println("=== Equipo Completo ===");
        System.out.println(proyecto.mostrarEquipo());

        System.out.println("=== Buscar D23 ===");
        Desarrollador encontrado = proyecto.buscarDesarrollador("D23");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("=== Buscar D99 ===");
        Desarrollador noExiste = proyecto.buscarDesarrollador("D99");

        if (noExiste != null) {
            System.out.println(noExiste.mostrarInformacion());
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("=== Eliminar D23 ===");
        if (proyecto.eliminarDesarrollador("D23")) {
            System.out.println("Desarrollador eliminado.");
        } else {
            System.out.println("No se encontró el desarrollador.");
        }

        System.out.println("=== Equipo después de eliminar ===");
        System.out.println(proyecto.mostrarEquipo());

        System.out.println("=== Horas Totales ===");
        System.out.println(proyecto.calcularTotalHoras());
    }
}