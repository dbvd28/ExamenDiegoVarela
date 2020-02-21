/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiegovarela;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Tutores extends Alumnos {
    private ArrayList clases=new ArrayList();
    private int ganancias;
    private int tutorias;
    private int enseñanza;

    public Tutores() {
    }

    public Tutores(int ganancias, int tutorias, int enseñanza, String nombre, int edad, String carrera, String nacimiento, int numcuenta, String usuario, String contraseña) {
        super(nombre, edad, carrera, nacimiento, numcuenta, usuario, contraseña);
        this.ganancias = ganancias;
        this.tutorias = tutorias;
        this.enseñanza = enseñanza;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutorias() {
        return tutorias;
    }

    public void setTutorias(int tutorias) {
        this.tutorias = tutorias;
    }

    public int getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(int enseñanza) {
        this.enseñanza = enseñanza;
    }

    @Override
    public String toString() {
        return "Tutores{" + "clases=" + clases + ", ganancias=" + ganancias + ", tutorias=" + tutorias + ", ense\u00f1anza=" + enseñanza + '}';
    }
    
}
