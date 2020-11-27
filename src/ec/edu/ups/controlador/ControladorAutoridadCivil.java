/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.AutoridadCivil;

/**
 *
 * @author paul_
 */
public class ControladorAutoridadCivil extends AbstractControlador<AutoridadCivil>{
    
    private AutoridadCivil autoridad;

    public AutoridadCivil getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(AutoridadCivil autoridad) {
        this.autoridad = autoridad;
    }
    
    @Override
    public boolean validar(AutoridadCivil objeto) {
        if(objeto.getRol().equals("Autoridad")){
        return true;
        }
        return false;
       
    }

    @Override
    public int generarId() {
        return 0;
       
    }
     public boolean iniciarSesion(String correo, String contrasenia) {

        for (AutoridadCivil usu : super.getLista()) {
            AutoridadCivil u = (AutoridadCivil) usu;
            if (u.getCorreo().equals(correo) && u.getContrasenia().equals(contrasenia)) {
                this.autoridad = u;
                return true;
            }

        }
        return false;
    }

}
