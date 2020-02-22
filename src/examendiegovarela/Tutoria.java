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
private String Tutores;
private ArrayList<Alumnos> al=new ArrayList();

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

    public String getTutores() {
        return Tutores;
    }

    public void setTutores(String Tutores) {
        this.Tutores = Tutores;
    }

    public ArrayList<Alumnos> getAl() {
        return al;
    }

    public void setAl(ArrayList<Alumnos> al) {
        this.al = al;
    }

    public Tutoria(int hora, int aula, Date fecha, String tema, String Tutores) {
        this.hora = hora;
        this.aula = aula;
        this.fecha = fecha;
        this.tema = tema;
        this.Tutores = Tutores;
    }

    @Override
    public String toString() {
        return "Tutoria{" + "fecha=" + fecha + '}';
    }

 
}
