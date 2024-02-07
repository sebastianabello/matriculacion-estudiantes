public class Calificacion {
    private int idCalificacion;
    private int valor;
    private Asignatura asignatura;

    public Calificacion(int idCalificacion, int valor, Asignatura asignatura) {
        this.idCalificacion = idCalificacion;
        this.valor = valor;
        this.asignatura = asignatura;
    }


    // Getters and Setters
    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}