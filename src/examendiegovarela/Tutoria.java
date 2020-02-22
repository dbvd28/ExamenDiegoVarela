/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiegovarela;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Tutoria {
 private int hora;
 private int aula;
private Date fecha;
private String tema;
private Tutores Tutores;
private ArrayList<Alumnos> al=new ArrayList();

    public Tutoria(int hora, int aula, Date fecha, String tema, Tutores Tutores) {
        this.hora = hora;
        this.aula = aula;
        this.fecha = fecha;
        this.tema = tema;
        this.Tutores = Tutores;
    }

    public Tutores getTutores() {
        return Tutores;
    }

    public void setTutores(Tutores Tutores) {
        this.Tutores = Tutores;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


    public ArrayList<Alumnos> getAl() {
        return al;
    }

    public void setAl(ArrayList<Alumnos> al) {
        this.al = al;
    }

    
    @Override
    public String toString() {
        return "Tutoria{" + "fecha=" + fecha + '}';
    }

 
}
