/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import static java.awt.SystemColor.text;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "pelicula")
public class Pelicula {
    
    @Id
    @Column(name = "pelicula_titulo")
    String peliculaTitulo;

    @Column(name = "pelicula_resumen")
    String peliculaResumen;
    
    @Column(name = "pelicula_anio")
    String peliculaAnio;
    
    @Column(name = "pelicula_dir_nombre")
    String peliculaDirNombre;

    public String getPeliculaTitulo() {
        return peliculaTitulo;
    }

    public void setPeliculaTitulo(String peliculaTitulo) {
        this.peliculaTitulo = peliculaTitulo;
    }

    public String getPeliculaResumen() {
        return peliculaResumen;
    }

    public void setPeliculaResumen(String peliculaResumen) {
        this.peliculaResumen = peliculaResumen;
    }

    public String getPeliculaAnio() {
        return peliculaAnio;
    }

    public void setPeliculaAnio(String peliculaAnio) {
        this.peliculaAnio = peliculaAnio;
    }

    public String getPeliculaDirNombre() {
        return peliculaDirNombre;
    }

    public void setPeliculaDirNombre(String peliculaDirNombre) {
        this.peliculaDirNombre = peliculaDirNombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "pelicula_titulo=" + peliculaTitulo + ", pelicula_resumen=" + peliculaResumen + ", pelicula_anio=" + peliculaAnio + ", pelicula_dir_nombre=" + peliculaDirNombre + '}';
    }
    
    
}
