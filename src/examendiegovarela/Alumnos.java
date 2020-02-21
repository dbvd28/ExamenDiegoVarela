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
public class Alumnos {
    private String nombre;
    private int edad;
    private String carrera;
    private String nacimiento;
    private int numcuenta;
    private String usuario;
    private String contraseña;

    public Alumnos() {
    }

    public Alumnos(String nombre, int edad, String carrera, String nacimiento, int numcuenta, String usuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.nacimiento = nacimiento;
        this.numcuenta = numcuenta;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + '}';
    }
    
}
