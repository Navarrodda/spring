package com.utn.spring.service;
import com.utn.spring.model.Persona;
import com.utn.spring.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public void add(final Persona persona){
        personaRepository.save(persona);

    }

    public  List<Persona> getPersona(){
        return personaRepository.findAll();
    }

}
