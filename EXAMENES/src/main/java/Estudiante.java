public class Estudiante
{
    private String nombre,curso;
    private float calificacion;

    public Estudiante(String nombre, String curso, float calificacion)
    {
        this.nombre = nombre;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getCurso()
    {
        return curso;
    }

    public float getCalificacion()
    {
        return calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante : " + nombre + " Curso: " + curso + " Calificacion: " + calificacion;
    }
}
