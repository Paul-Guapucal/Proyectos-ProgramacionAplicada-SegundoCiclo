/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.modelo.ListaPersonas;
import ec.edu.ups.modelo.Persona;
import java.util.Iterator;

/**
 *
 * @author paul_
 */
public class Programa {

    public static void main(String[] args) {

        ListaPersonas lp = new ListaPersonas();
        Iterator<Persona> it;
        Persona e; // Este objeto lo usaremos para almacenar temporalmente objetos Persona
        lp.getListaPersonas().add(new Persona(1, "Maria", 175));
        lp.getListaPersonas().add(new Persona(2, "Carla", 160));
        lp.getListaPersonas().add(new Persona(3, "Enriqueta", 190));
        System.out.println("\nLista antes de recorrer/eliminar: " + lp.toString());
        it = lp.iterator();
        while (it.hasNext()) {
            e = it.next();
            if (e.getAltura() < 170) {
                it.remove();
            } //  it.remove() elimina la persona de la colección
        }
        System.out.println("\nLista después de recorrer/eliminar: " + lp.toString());

    }
}
