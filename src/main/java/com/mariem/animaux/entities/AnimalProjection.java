package com.mariem.animaux.entities;


import org.springframework.data.rest.core.config.Projection;
import com.mariem.animaux.entities.Animal;

@Projection(name = "nomAnimal", types = { Animal.class })
public interface AnimalProjection {
	 public String getNomAnimal();
}
