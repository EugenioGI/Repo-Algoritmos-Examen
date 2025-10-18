public class Asignatura
{
    protected int unidad;
    protected String materia;

    public Asignatura(int unidad, String materia)
    {
        this.unidad = unidad;
        this.materia = materia;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "unidad=" + unidad +
                ", materia='" + materia + '\'' +
                '}';
    }
}
