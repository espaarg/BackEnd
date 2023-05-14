package com.MiPortfolio.LucasOrtiz.Seguridad.Servicio;

import com.MiPortfolio.LucasOrtiz.Seguridad.Entidad.Rol;
import com.MiPortfolio.LucasOrtiz.Seguridad.Enums.RolNombre;
import com.MiPortfolio.LucasOrtiz.Seguridad.Repositorio.iRolRepositorio;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolServicio {
    @Autowired
    iRolRepositorio irolRepositorio;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return irolRepositorio.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepositorio.save(rol);
    }
}
