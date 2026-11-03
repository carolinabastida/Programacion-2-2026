public class Main {
    public static void main(String[] args) {
        // Representamos una estudiante con los datos que necesitamos.
        Estudiante estudiante = new Estudiante("Ana", "7A", 9);
        estudiante.mostrarDatos();
    }
}

class Estudiante {
    private String nombre;
    private String grupo;
    private int calificacion;

    public Estudiante(String nombre, String grupo, int calificacion) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.calificacion = calificacion;
    }

    public void mostrarDatos() {
        System.out.println("Datos de la estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Grupo: " + grupo);
        System.out.println("Calificacion: " + calificacion);
    }
}
