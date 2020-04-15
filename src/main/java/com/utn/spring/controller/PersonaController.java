package com.utn.spring.controller;

import com.utn.spring.model.Persona;
import com.utn.spring.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(final PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }

    @PostMapping("/")
    public void addPersona(@RequestBody  Persona persona){
        personaService.add(persona);
    }
    
}
