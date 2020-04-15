package com.utn.spring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Persona {

    @Id
    @GeneratedValue
    private Integer idPersona;
    @NotNull
    private String name;
    @NotNull
    private String surname;

}
