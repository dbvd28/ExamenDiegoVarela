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

    public Examenes(String clase, int conocimiento, int puntaje) {
        this.clase = clase;
        this.conocimiento = conocimiento;
        this.puntaje = puntaje;
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
    
    
}
