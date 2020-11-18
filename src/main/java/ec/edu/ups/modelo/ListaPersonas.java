/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author paul_
 */
public class ListaPersonas {

    private ArrayList<Persona> listapersona = null;  //Campo de la clase

    public ListaPersonas() {                          // Constructor de la clase

        listapersona = new ArrayList<Persona>();

    }

    public ArrayList<Persona> getListaPersonas() {    //Omitimos otros métodos

        return listapersona;

    }

    protected class MiIteradorListaPersonas implements Iterator<Persona>{ // Clase interna

        public int posicion = 0;
        public boolean sepuedeeliminar = false;  // Campos

        @Override

        public boolean hasNext() {
            return posicion < listapersona.size();
        }  // Método

        @Override

        public Persona next() {  // Método

            Persona res = listapersona.get(posicion); // Creamos un objeto Persona igual al que recorremos
            posicion++;
            sepuedeeliminar = true;
            return res;
        }

        @Override

        public void remove() {

            if (sepuedeeliminar) {
                listapersona.remove(posicion - 1);
                posicion--;
                sepuedeeliminar = false;
            }

        } 

    } 

    public Iterator<Persona> iterator() {            // Método de la clase

        return new MiIteradorListaPersonas();

    }

    @Override
    public String toString() {                      // Método de la clase
        
        return listapersona.toString();
    }  

}
