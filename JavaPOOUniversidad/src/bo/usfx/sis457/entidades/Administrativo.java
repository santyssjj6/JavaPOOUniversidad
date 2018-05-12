/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.*;

public class Administrativo extends Persona {
    protected String Cargo;
    protected String LugarTrabajo;
    protected Calendar FechaIngreso;
  
    
    public Administrativo(String cargo,String carnetIdentidad, String nombre, String Lugar_de_trabajo,Calendar fechaNacimiento, Calendar fechaIngreso) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.LugarTrabajo = Lugar_de_trabajo;
        this.FechaIngreso = fechaIngreso;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }
    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CI 
                + ", Nombre=" + this.Nombre 
                + ", Fecha_de_Nacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + Cargo 
                + ", Fecha_de_Ingreso=" + Utilitarios.getFechaCalendario(this.FechaIngreso)
                + ", Lugar_de_trabajo=" + LugarTrabajo + '}';
    }
    
}
