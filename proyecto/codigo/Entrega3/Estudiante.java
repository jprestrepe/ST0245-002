public class Estudiante {

    String[] estudiante;

    // public ArrayList<String[]>estudiantes;
    public Estudiante(String[] base) {
        this.estudiante = base;
    }

    public void setEstudiante(String[] estudiante) {
        this.estudiante = estudiante;
        // estudiantes.add(estudiante);
    }

    public String[] getEstudiante() {
        return estudiante;
    }

}