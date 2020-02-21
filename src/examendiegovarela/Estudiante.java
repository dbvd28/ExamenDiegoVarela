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
public class Estudiante extends Alumnos{
    private int conocimiento;
    private int aprendizaje;
    private ArrayList examenes=new ArrayList();

    public Estudiante(int conocimiento, int aprendizaje, String nombre, int edad, String carrera, String nacimiento, int numcuenta, String usuario, String contraseña) {
        super(nombre, edad, carrera, nacimiento, numcuenta, usuario, contraseña);
        this.conocimiento = conocimiento;
        this.aprendizaje = aprendizaje;
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

    public ArrayList getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "conocimiento=" + conocimiento + ", aprendizaje=" + aprendizaje + ", examenes=" + examenes + '}';
    }
    
}
