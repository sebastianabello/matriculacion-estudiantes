public class Asignatura {
    private int idAsignatura;
    private String nombre;
    private String descripcion;
    private int creditos;
    private Profesor profesor;

    public Asignatura(int idAsignatura, String nombre, String descripcion, int creditos, Profesor profesor) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
