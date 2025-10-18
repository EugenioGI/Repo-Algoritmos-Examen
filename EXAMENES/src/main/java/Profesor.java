public class Profesor extends Usuario
{
    private  Asignatura asignatura;

    public Profesor(String id, String nombreCompleto, String usuario, String password, String correo, String materia) {
        super(id, nombreCompleto, usuario, password, correo);
    }
    public Asignatura getAsignatura() {
        return asignatura;
    }

}