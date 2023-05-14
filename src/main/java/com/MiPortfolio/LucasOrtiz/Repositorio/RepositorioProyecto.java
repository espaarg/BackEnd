/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MiPortfolio.LucasOrtiz.Repositorio;

import com.MiPortfolio.LucasOrtiz.Entidad.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProyecto extends JpaRepository<Proyecto, Integer> {
       public Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
