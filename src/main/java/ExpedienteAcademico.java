public class ExpedienteAcademico {
    private int idExpedienteAcademico;
    private Estudiante estudiante;
    private Asignatura asignatura;
    private Calificacion calificacion;

    public ExpedienteAcademico(int idExpedienteAcademico, Estudiante estudiante, Asignatura asignatura, Calificacion calificacion) {
        this.idExpedienteAcademico = idExpedienteAcademico;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.calificacion = calificacion;
    }

    public int getIdExpedienteAcademico() {
        return idExpedienteAcademico;
    }

    public void setIdExpedienteAcademico(int idExpedienteAcademico) {
        this.idExpedienteAcademico = idExpedienteAcademico;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }
}
