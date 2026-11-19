package com.mariem.animaux.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mariem.animaux.entities.GroupeAnimal;

@RepositoryRestResource(path = "groupe")
@CrossOrigin(origins = "http://localhost:4200")
public interface GroupeAnimalRepository
        extends JpaRepository<GroupeAnimal, Long> {

}