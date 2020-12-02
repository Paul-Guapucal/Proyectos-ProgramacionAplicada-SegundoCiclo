/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author paul_
 */
public class Rector implements Serializable{
    
    private Profesor profesor;
    private String rol;
    private String correo;
    private String pass;

    public Rector(Profesor profesor, String rol, String correo, String pass) {
        this.profesor = profesor;
        this.rol = rol;
        this.correo = correo;
        this.pass = pass;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rector{profesor=").append(profesor);
        sb.append(", rol=").append(rol);
        sb.append(", correo=").append(correo);
        sb.append(", pass=").append(pass);
        sb.append('}');
        return sb.toString();
    }
    
}
