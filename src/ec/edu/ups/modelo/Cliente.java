/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.vista.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import ec.edu.ups.modelo.Cajero;


/**
 *
 * @author paul_
 */
public class Cliente implements Runnable{
  
    Cajero m;
  
    public Cliente( Cajero m) {
        
        this.m=m;
        m.clientes++;
                
    }

    public Cliente() {
    
    }
    
    @Override
    public void run() {
           while(true){
            if(Thread.currentThread().isAlive()){
                if(!m.cajero1){
                    m.ingresoCajero1();
                    break;
                }else  if(!m.cajero2){
                 m.ingresoCajero2();
                    break;
                }else if(!m.cajero3){
                 m.ingresoCajero3();
                    break;
                }
            }
        }
    }
}
