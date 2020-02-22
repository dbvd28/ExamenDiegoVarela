/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendiegovarela;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Estudiante extends Alumnos{
    private int conocimiento;
    private int aprendizaje;
    private ArrayList <Examenes>examenespen=new ArrayList();
    private ArrayList <Examenes>examenesre=new ArrayList();

    public Estudiante() {
    }

    public Estudiante(int conocimiento, int aprendizaje, String nombre, int edad, String carrera, String nacimiento, int numcuenta, String usuario, String contraseña) {
        super(nombre, edad, carrera, nacimiento, numcuenta, usuario, contraseña);
        this.conocimiento = conocimiento;
        this.aprendizaje = aprendizaje;
    }

    public ArrayList<Examenes> getExamenespen() {
        return examenespen;
    }

    public void setExamenespen(ArrayList<Examenes> examenespen) {
        this.examenespen = examenespen;
    }

    public ArrayList<Examenes> getExamenesre() {
        return examenesre;
    }

    public void setExamenesre(ArrayList<Examenes> examenesre) {
        this.examenesre = examenesre;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(int aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "conocimiento=" + conocimiento + ", aprendizaje=" + aprendizaje + ", examenespen=" + examenespen + ", examenesre=" + examenesre + '}';
    }


    
     
}
