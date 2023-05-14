
package com.MiPortfolio.LucasOrtiz.Repositorio;

import com.MiPortfolio.LucasOrtiz.Entidad.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEdu extends JpaRepository<Educacion, Integer>{
     public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
