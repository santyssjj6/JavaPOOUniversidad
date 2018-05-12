/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.*;


public class DocenteTitular  extends Docente{
    protected String ExamenCompetencia;
    
    public DocenteTitular(int exp, String asignaturas[],String examenCompetencia, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(exp, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia=examenCompetencia;
    }

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
    }
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CI 
                + ", Nombre=" + this.Nombre
                + ", Examen de Competencia=" + this.ExamenCompetencia
                + ", Contrato=" + Arrays.toString(Asignaturas)
                + ", Anios de Experiecia=" + this.Experiencia 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + Titulo + '}';
    }


       
}

