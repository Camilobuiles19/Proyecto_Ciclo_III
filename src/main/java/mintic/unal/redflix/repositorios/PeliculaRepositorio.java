/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.repositorios;

import java.util.Optional;
import mintic.unal.redflix.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, String> {

    public Optional<Pelicula> findById(String id);
    
}

