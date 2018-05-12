/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;

public class DocenteContrato extends Docente{
    protected String NumeroContrato;
    public DocenteContrato(String numContrato, int exp, String[] asignaturas, String titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(exp, asignaturas, titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.NumeroContrato = numContrato;
    }

    public String getNumeroContrato() {
        return NumeroContrato;
    }

    public void setNumeroContrato(String NumeroContrato) {
        this.NumeroContrato = NumeroContrato;
    }
    
    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CI 
                + ", Nombre=" + this.Nombre
                + ", Numero de Contrato=" + this.NumeroContrato
                + ", Anios de Experiecia=" + this.Experiencia 
                + ", Contrato=" + Arrays.toString(Asignaturas) 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + Titulo + '}';
    }
}