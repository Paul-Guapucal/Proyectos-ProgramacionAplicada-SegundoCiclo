/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Profesor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author paul_
 */
public class ControladorProfesor extends AbstractControlador<Profesor> {
    
    private ControladorPersona control;

    public ControladorProfesor(ControladorPersona control, String ruta) {
        super(ruta);
        this.control = control;
    }

    @Override
    public boolean validar(Profesor objeto) {
        return control.validar(objeto);

    }

    @Override
    public int generarId() {
        return 0;

    }

    public List<Profesor> docentes() {

        List<Profesor> lista = new ArrayList();
        Profesor docente;
        Iterator i = super.getLista().iterator();
        while (i.hasNext()) {
            docente = (Profesor) i.next();
            lista.add(docente);

        }
        return lista;
    }
    
}
