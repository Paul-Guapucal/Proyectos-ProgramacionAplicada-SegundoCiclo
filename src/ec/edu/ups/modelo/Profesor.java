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
public class Profesor extends Persona{
    
    private String titulo;
    private String tipoTitulo;
    private Curso curso;
    private Rector rector;
    
    public Profesor(String cedula, String nombre, String apellido, int edad, String direccion) {
        super(cedula, nombre, apellido, edad, direccion);
    }
    
    public Profesor(String cedula, String nombre, String apellido, int edad, String direccion, String titulo, String tipoTitulo) {
        super(cedula, nombre, apellido, edad, direccion);
        this.tipoTitulo = tipoTitulo;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoTitulo() {
        return tipoTitulo;
    }

    public void setTipoTitulo(String tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{titulo=").append(titulo);
        sb.append(", tipoTitulo=").append(tipoTitulo);
        sb.append(", curso=").append(curso);
        sb.append(", rector=").append(rector);
        sb.append('}');
        return sb.toString();
    }
    
}
