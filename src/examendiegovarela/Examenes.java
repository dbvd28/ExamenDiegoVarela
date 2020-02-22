/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiegovarela;

/**
 *
 * @author diego
 */
public class Examenes {

    private String clase;
    private int conocimiento;
    private int puntaje;
    private String tema;

    public Examenes(String clase, int conocimiento, int puntaje, String tema) {
        this.clase = clase;
        this.conocimiento = conocimiento;
        this.puntaje = puntaje;
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Examenes{" + "clase=" + clase + '}';
    }

    public boolean aprobado() {
        Estudiante e = new Estudiante();
        if (conocimiento > e.getConocimiento()) {
            return false;
        } else {
            return true;
        }
    }
}
