public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String correo;
    private String programaAcademico;
    private ExpedienteAcademico expedienteAcademico;

    public Estudiante(int idEstudiante, String nombre, String apellido, String correo, String programaAcademico) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.programaAcademico = programaAcademico;
        this.expedienteAcademico = new ExpedienteAcademico(0, this, null, null);
    }


    // Getters and Setters
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public ExpedienteAcademico getExpedienteAcademico() {
        return expedienteAcademico;
    }

    public void setExpedienteAcademico(ExpedienteAcademico expedienteAcademico) {
        this.expedienteAcademico = expedienteAcademico;
    }
}
