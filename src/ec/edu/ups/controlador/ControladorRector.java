/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Profesor;
import ec.edu.ups.modelo.Rector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author paul_
 */
public class ControladorRector extends AbstractControlador<Rector>{
    
    private Rector usuario;
    
    public ControladorRector(String ruta) {
        super(ruta);
        
    }
    
    @Override
    public boolean validar(Rector objeto) {
        return true;
        
    }
    
    @Override
    public int generarId() {
        return 0;
        
    }
    
    public List<Rector> usuarios() {
        
        List<Rector> lista = new ArrayList();
        Rector u;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            u = (Rector) i.next();
            lista.add(u);
            
        }
        return lista;
        
    }
    
    public Rector getUsuario() {
        return usuario;
    }
    
    public boolean iniciarSesion(String correo, String pass) {
        
        for (Rector usu : super.getLista()) {
            Rector u = (Rector) usu;
            if (u.getCorreo().equals(correo) && u.getPass().equals(pass)) {
                this.usuario = u;
                return true;
            }
        }
        return false;
        
    }
    
    public Rector buscarU(Rector docente) {
        
        for (Rector usu : super.getLista()) {
            Rector u = (Rector) usu;
            if (docente.equals(u.getProfesor())) {
                this.usuario = u;
                
            }
        }
        return null;
    }

    public Rector buscarU(Profesor doc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
