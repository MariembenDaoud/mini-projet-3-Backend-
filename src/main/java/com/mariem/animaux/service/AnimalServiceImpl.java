package com.mariem.animaux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariem.animaux.entities.Animal;
import com.mariem.animaux.entities.GroupeAnimal;
import com.mariem.animaux.repos.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    @Override
    public Animal saveAnimal(Animal a) {
        return animalRepository.save(a);
    }

    @Override
    public Animal updateAnimal(Animal a) {
        return animalRepository.save(a);
    }

    @Override
    public void deleteAnimal(Animal a) {
        animalRepository.delete(a);
    }

    @Override
    public void deleteAnimalById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public Animal getAnimal(Long id) {
        return animalRepository.findById(id).get();
    }

    @Override
    public List<Animal> getAllAnimaux() {
        return animalRepository.findAll();
    }

    @Override
    public List<Animal> findByNomAnimal(String nom) {
        return animalRepository.findByNomAnimal(nom);
    }

    @Override
    public List<Animal> findByNomAnimalContains(String nom) {
        return animalRepository.findByNomAnimalContains(nom);
    }

    @Override
    public List<Animal> findByNomAge(String nom, Integer age) {
        return animalRepository.findByNomAge(nom, age);
    }

    @Override
    public List<Animal> findByGroupeAnimal(GroupeAnimal groupe) {
        return animalRepository.findByGroupeAnimal(groupe);
    }

    @Override
    public List<Animal> findByGroupeAnimalIdGroupe(Long id) {
        return animalRepository.findByGroupeAnimalIdGroupe(id);
    }

    @Override
    public List<Animal> findByOrderByNomAnimalAsc() {
        return animalRepository.findByOrderByNomAnimalAsc();
    }

    @Override
    public List<Animal> trierAnimauxNomsAge() {
        return animalRepository.trierAnimauxNomsAge();
    }
    
}