package com.mariem.animaux.service;

import java.util.List;

import com.mariem.animaux.entities.Animal;
import com.mariem.animaux.entities.GroupeAnimal;

public interface AnimalService {
    Animal saveAnimal(Animal a);
    Animal updateAnimal(Animal a);
    void deleteAnimal(Animal a);
    void deleteAnimalById(Long id);
    Animal getAnimal(Long id);
    List<Animal> getAllAnimaux();
    List<Animal> findByNomAnimal(String nom);
    List<Animal> findByNomAnimalContains(String nom);
    List<Animal> findByNomAge(String nom, Integer age);
    List<Animal> findByGroupeAnimal(GroupeAnimal groupe);
    List<Animal> findByGroupeAnimalIdGroupe(Long id);
    List<Animal> findByOrderByNomAnimalAsc();
    List<Animal> trierAnimauxNomsAge();
}