/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author paul_
 */
public class Matrimonio {
    
    private int numMatrimonio;
    private String lugar;
    private Date fecha;
    private Persona contrayente1;
    private Persona contrayente2;
    private Persona testigo1;
    private Persona testigo2;
    private Persona autoridadCivil;

    public Matrimonio() {
    }

    public Matrimonio(int numMatrimonio, String lugar, Date fecha, Persona contrayente1, Persona contrayente2, Persona testigo1, Persona testigo2, Persona autoridadCivil) {
        this.numMatrimonio = numMatrimonio;
        this.lugar = lugar;
        this.fecha = fecha;
        this.contrayente1 = contrayente1;
        this.contrayente2 = contrayente2;
        this.testigo1 = testigo1;
        this.testigo2 = testigo2;
        this.autoridadCivil = autoridadCivil;
    }

    public int getNumMatrimonio() {
        return numMatrimonio;
    }

    public void setNumMatrimonio(int numMatrimonio) {
        this.numMatrimonio = numMatrimonio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getContrayente1() {
        return contrayente1;
    }

    public void setContrayente1(Persona contrayente1) {
        this.contrayente1 = contrayente1;
    }

    public Persona getContrayente2() {
        return contrayente2;
    }

    public void setContrayente2(Persona contrayente2) {
        this.contrayente2 = contrayente2;
    }

    public Persona getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(Persona testigo1) {
        this.testigo1 = testigo1;
    }

    public Persona getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(Persona testigo2) {
        this.testigo2 = testigo2;
    }

    public Persona getAutoridadCivil() {
        return autoridadCivil;
    }

    public void setAutoridadCivil(Persona autoridadCivil) {
        this.autoridadCivil = autoridadCivil;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numMatrimonio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matrimonio other = (Matrimonio) obj;
        if (this.numMatrimonio != other.numMatrimonio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matrimonio{numMatrimonio=").append(numMatrimonio);
        sb.append(", lugar=").append(lugar);
        sb.append(", fecha=").append(fecha);
        sb.append(", contrayente1=").append(contrayente1);
        sb.append(", contrayente2=").append(contrayente2);
        sb.append(", testigo1=").append(testigo1);
        sb.append(", testigo2=").append(testigo2);
        sb.append(", autoridad=").append(autoridadCivil);
        sb.append('}');
        return sb.toString();
    }
    
}
