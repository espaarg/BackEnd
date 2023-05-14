package com.MiPortfolio.LucasOrtiz.Seguridad.Repositorio;

import com.MiPortfolio.LucasOrtiz.Seguridad.Entidad.Rol;
import com.MiPortfolio.LucasOrtiz.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepositorio extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
