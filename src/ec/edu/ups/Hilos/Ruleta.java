/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Hilos;

import ec.edu.ups.controlador.ControladorJugador;
import ec.edu.ups.modelo.JugadorRuleta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author paul_
 */
public class Ruleta implements Runnable {

    private ArrayList<JugadorRuleta> jugadores;
    private String juego;
    private JTextArea descripcion;
    private int segundos;
    private ControladorJugador control;
    private boolean iterar = true;
    private JugadorRuleta j;

    private JLabel saldoBanca;

    private JLabel numeroB;

    public Ruleta(List<JugadorRuleta> jugadores, int segundos, JTextArea descripcion, JLabel saldoBanca, JLabel numeroB, ControladorJugador control, String juego) {
        this.jugadores = (ArrayList<JugadorRuleta>) jugadores;
        this.segundos = segundos;
        this.descripcion = descripcion;
        this.control = control;
        this.juego = juego;
        this.saldoBanca = saldoBanca;
        this.numeroB = numeroB;
    }

    int numeroBanca = 0;

    @Override
    public void run() {

        while (iterar) {

            numeroBanca = RandomNumber();
            restarSaldoJugador();
            tiempoEsperar(segundos);
            if (numeroBanca == 0) {

            }
            switch (juego) {
                case "concreto":
                    jugadores.stream().map(jugador -> {
                        if (numeroBanca == jugador.getNumero()) {
                            j = jugador;
                            j.setSaldo(jugador.getSaldo() + (360));
                            j.setnWins(jugador.getnWins() + 1);
                            descripcion.setText(jugador.getNombre() + "Gana 360 euros");
                            saldoBanca.setText("" + (Float.parseFloat(saldoBanca.getText() + "") - 360));
                            tiempoEsperar(segundos);
                        }
                        return jugador;
                    }).filter(jugador -> (numeroBanca != jugador.getNumero())).map(jugador -> {
                        j = jugador;
                        j.setnLost(jugador.getnLost() + 1);
                        descripcion.setText(jugador.getNombre() + "Pierde");
                        return jugador;
                    }).forEachOrdered((JugadorRuleta _item) -> {
                        tiempoEsperar(segundos);
                        iterar = false;
                    });
                    control.actualizar(j);
                    break;

                case "parImpar":
                    jugadores.forEach(jugador -> {
                        if (parImpar(numeroBanca) == jugador.getIsPar()) {
                            j = jugador;
                            j.setSaldo(jugador.getSaldo() + 20);
                            j.setnWins(jugador.getnWins() + 1);
                            descripcion.setText(jugador.getNombre() + "Gana 20 euros");
                            saldoBanca.setText("" + (Float.parseFloat(saldoBanca.getText() + "") - 20));
                            tiempoEsperar(segundos);
                        } else {
                            j = jugador;
                            j.setnLost(jugador.getnLost() + 1);
                            descripcion.setText(jugador.getNombre() + "Pierde");
                            tiempoEsperar(segundos);
                            iterar = false;
                        }
                    });
                    control.actualizar(j);
                    break;

                case "martingala":
                    jugadores.stream().map(jugador -> {
                        if (numeroBanca == jugador.getNumero()) {
                            j = jugador;
                            j.setSaldo(jugador.getSaldo() + (360));
                            j.setnWins(jugador.getnWins() + 1);
                            descripcion.setText(jugador.getNombre() + "Gana 360 euros");
                            saldoBanca.setText("" + (Float.parseFloat(saldoBanca.getText() + "") - 360));
                        }
                        return jugador;
                    }).filter(jugador -> (numeroBanca != jugador.getNumero())).forEachOrdered(jugador -> {
                        j = jugador;
                        j.setnLost(jugador.getnLost() + 1);
                        j.setIsDuplicar(true);
                        descripcion.setText(jugador.getNombre() + "Pierde y se duplica apuesta");
                        tiempoEsperar(segundos);
                        iterar = false;
                    });
                    control.actualizar(j);
                    
                    break;

                default:
                    break;
            }

        }
    }

    public void reanudar() {
        iterar = true;
    }

    public boolean isIterar() {
        return iterar;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }

    private void tiempoEsperar(int segundos) {

        segundos = segundos * 1000;
        try {
            descripcion.setText("Esperando...... " + segundos);
            Thread.sleep(segundos);

        } catch (InterruptedException e) {

        }
    }

    private void restarSaldoJugador() {
        for (JugadorRuleta jugador : jugadores) {
            if (jugador.isIsDuplicar()) {
                JugadorRuleta j = jugador;
                j.setSaldo(jugador.getSaldo() - (jugador.getCantidadApuesta()) * 2);
                j.setCantidadApuesta((jugador.getCantidadApuesta()) * 2);
                j.setnApuestas(jugador.getnApuestas() + 1);
                tiempoEsperar(segundos);
                //control.actualizar(j);
            } else {

                descripcion.setText(jugador.getNombre() + " apuesta 10 euros al numero " + jugador.getNumero() + "\n");
                JugadorRuleta j = jugador;
                j.setSaldo(jugador.getSaldo() - 10);
                j.setCantidadApuesta(jugador.getCantidadApuesta() + 10);
                j.setnApuestas(jugador.getnApuestas() + 1);
                tiempoEsperar(segundos);
                // control.actualizar(j);
            }

        }
    }

    private int RandomNumber() {
        int numero = ThreadLocalRandom.current().nextInt(0, 36 + 1);
        numeroB.setText("" + numero);
        return numero;

    }

    private int parImpar(int numero) {
        if (numero % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public void stop() {
        iterar = false;
    }
}
