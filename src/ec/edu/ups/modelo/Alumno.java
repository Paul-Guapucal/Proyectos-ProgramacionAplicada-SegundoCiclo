/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author paul_
 */
public class Alumno extends Persona{
    
    private String aula;
    private Curso curso;

    public Alumno(String cedula, String nombre, String apellido, int edad, String direccion, Curso curso, String aula) {
        super(cedula, nombre, apellido, edad, direccion);
        this.curso = curso;
        this.aula = aula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{aula=").append(aula);
        sb.append(", curso=").append(curso);
        sb.append('}');
        return sb.toString();
    }
        
}
