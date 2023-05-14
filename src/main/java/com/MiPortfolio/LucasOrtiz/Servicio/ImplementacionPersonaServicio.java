package com.MiPortfolio.LucasOrtiz.Servicio;

import com.MiPortfolio.LucasOrtiz.Entidad.Persona;
import com.MiPortfolio.LucasOrtiz.Repositorio.IPersonaRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImplementacionPersonaServicio {
    @Autowired 
    IPersonaRepositorio ipersonaRepositorio;
    
  public List<Persona> list(){
        return ipersonaRepositorio.findAll();
    }
    
    public Optional<Persona> getOne (int id){
        return ipersonaRepositorio.findById(id);
    }
        
        public Optional<Persona> getByNombre (String nombre){
            return ipersonaRepositorio.findByNombre(nombre);
        }
        
    public void save (Persona persona){
        ipersonaRepositorio.save(persona);
    }
    
    public void delete (int id){
        ipersonaRepositorio.deleteById(id);
    }
    
    public boolean existsById (int id){
        return ipersonaRepositorio.existsById(id);
    }
    
    
    public boolean existsByNombre(String nombre){
        return ipersonaRepositorio.existsByNombre(nombre);
    }
    
        

 
}
