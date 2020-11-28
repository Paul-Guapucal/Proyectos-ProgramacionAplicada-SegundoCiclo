/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author paul_
 */
public class AutoridadCivil extends Persona {
    
    private String cargo;
    private String correo;
    private String pass;

    public AutoridadCivil() {
    }

    public AutoridadCivil(String cargo, String correo, String pass, String cedula, String nombres, String apellidos, 
            String direccion, String genero, Date fechaDeNacimiento, String estadoCivil, String rol) {
        super(cedula, nombres, apellidos, direccion, genero, fechaDeNacimiento, estadoCivil, rol);
        this.cargo = cargo;
        this.correo = correo;
        this.pass = pass;
    }

    public AutoridadCivil(String trim, String trim0, String trim1, String trim2, String trim3, Date fechaN, String trim4, String autoridad, String trim5, String trim6, String trim7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String contrasenia) {
        this.pass = contrasenia;
    }

}
