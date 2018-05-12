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
public class Docente extends Persona {
    protected String Titulo;
    protected String[] Asignaturas;
    protected int Experiencia;
    
    public Docente(int exp, String asignaturas[], String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Asignaturas= asignaturas;
        this.Titulo = titulo;
        this.Experiencia = exp ;
    }

    public Docente(String asignaturas[], String titulo, int exp) {
        this.Asignaturas = asignaturas;
        this.Titulo = titulo;
        this.Experiencia=exp;
    }

    public String[] getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String Asignaturas) {
        this.Asignaturas = Asignaturas.split("-");
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }
    
    public int getExperiencia() {
        return Experiencia;
    }


    
    @Override
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CI 
                + ", Nombre=" + this.Nombre 
                + ", Asignaturas=" + Arrays.toString(Asignaturas) 
                + ", Anios de Experiecia=" + this.Experiencia 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + Titulo + '}';
    }
    
}

