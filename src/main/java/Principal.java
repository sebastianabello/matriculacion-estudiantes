public class Principal {
    public static void main(String[] args) {
        //Estudiantes:
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", "juanPerez@correo.com", "Ingenieria de Sistemas");
        Estudiante estudiante2 = new Estudiante(2, "Maria", "Lopez", "MariaLopez@correo.com", "Ingenieria de Sistemas");
        Estudiante estudiante3 = new Estudiante(3, "Carlos", "Gomez", "CarlosGonzalez@correo.com", "Ingenieria de Sistemas");

        //Profesores:
        Profesor profesor1 = new Profesor(1, "Pedro", "Pedroz", "PedroGomez@correo.com");
        Profesor profesor2 = new Profesor(2, "sebastian", "Abello", "sebastianAbello@correo.com");
        Profesor profesor3 = new Profesor(3, "Andres", "Gomez", "AndreaGomez@correo.com");

        //Asignaturas:
        Asignatura asignatura1 = new Asignatura(1, "Matematicas", "Calculo diferencial", 4, profesor1);
        Asignatura asignatura2 = new Asignatura(2, "Fisica", "Fisica Mecanica", 4, profesor2);
        Asignatura asignatura3 = new Asignatura(3, "Programacion", "Programacion Orientada a Objetos", 4, profesor3);


    }
}
