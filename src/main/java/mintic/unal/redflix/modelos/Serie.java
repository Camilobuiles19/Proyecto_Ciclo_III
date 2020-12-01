/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */

@Entity
@Table(name = "serie")
public class Serie {
    
    @Id
    @Column(name = "serie_titulo")
    String serTitulo;

    @Column(name = "serie_episodios")
    String serEpisodios;
    
    @Column(name = "serie_temporadas")
    String serTemporadas;

    public String getSerTitulo() {
        return serTitulo;
    }

    public void setSerTitulo(String serTitulo) {
        this.serTitulo = serTitulo;
    }

    public String getSerEpisodios() {
        return serEpisodios;
    }

    public void setSerEpisodios(String serEpisodios) {
        this.serEpisodios = serEpisodios;
    }

    public String getSerTemporadas() {
        return serTemporadas;
    }

    public void setSerTemporadas(String serTemporadas) {
        this.serTemporadas = serTemporadas;
    }

   

    @Override
    public String toString() {
        return "Serie{" + "serie_titulo=" + serTitulo+ ", serie_episodios=" + serEpisodios + ", serie_temporadas=" + serTemporadas + '}';
    }
    
     
}

