/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Alumno extends Persona {
    
    protected String Asignatura[];
    protected int Semestre;
    protected String CU;
    
    public Alumno(String carnetUniversitario,String[] asignatura, int semestre, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.CU = carnetUniversitario;
        this.Asignatura= asignatura;
        this.Semestre = semestre;
    }

    public String[] getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura.split("-");
    }
    
    public Alumno(String carnetUniversitario, int semestre) {
        super();
        this.CU = carnetUniversitario;
        this.Semestre = semestre;
    }
    
    public String getCU() {
        return CU;
    }

    public void setCU(String carnetUniversitario) {
        this.CU = carnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        this.Semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CI 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Asignaturas=" + Arrays.toString(this.Asignatura)
                + ", CarnetUniversitario=" + this.CU 
                + ", Semestre=" + this.Semestre + '}';
    }
}