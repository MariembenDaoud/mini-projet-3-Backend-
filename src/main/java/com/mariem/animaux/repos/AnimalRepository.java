package com.mariem.animaux.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mariem.animaux.entities.Animal;
import com.mariem.animaux.entities.GroupeAnimal;

@RepositoryRestResource(path = "rest")
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByNomAnimal(String nom);

    List<Animal> findByNomAnimalContains(String nom);

    @Query("select a from Animal a where a.nomAnimal like %:nom and a.age > :age")
    List<Animal> findByNomAge(@Param("nom") String nom, @Param("age") Integer age);

    @Query("select a from Animal a where a.groupeAnimal = ?1")
    List<Animal> findByGroupeAnimal(GroupeAnimal groupe);

    List<Animal> findByGroupeAnimalIdGroupe(Long id);

    List<Animal> findByOrderByNomAnimalAsc();

    @Query("select a from Animal a order by a.nomAnimal ASC, a.age DESC")
    List<Animal> trierAnimauxNomsAge();
}