import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int idProfesor;
    private String nombre;
    private String apellido;
    private String correo;
    private List<Asignatura> asignaturas;

    public Profesor(int idProfesor, String nombre, String apellido, String correo) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.asignaturas = new ArrayList<>();
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
