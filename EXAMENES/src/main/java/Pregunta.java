public class Pregunta
{
    String pregunta,respuesta1,respuesta2,respuesta3,respuesta4;
    boolean correcta;

    public Pregunta(String pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, boolean correcta)
    {
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.correcta = correcta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public boolean isCorrecta() {
        return correcta;
    }
}
