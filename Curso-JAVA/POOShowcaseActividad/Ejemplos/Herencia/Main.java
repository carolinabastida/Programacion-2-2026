public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", "7A");
        estudiante.mostrarNombre();
        estudiante.mostrarGrupo();
    }
}

class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

class Estudiante extends Persona {
    private String grupo;

    public Estudiante(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    public void mostrarGrupo() {
        System.out.println("Grupo: " + grupo);
    }
}
