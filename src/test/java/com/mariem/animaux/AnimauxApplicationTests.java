
package com.mariem.animaux;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mariem.animaux.entities.Animal;
import com.mariem.animaux.repos.AnimalRepository;

@SpringBootTest
class AnimauxApplicationTests {

    @Autowired
    private AnimalRepository animalRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateAnimal() {
        Animal anim = new Animal("Mimi", "Chien", 2, new Date());
        animalRepository.save(anim);
    }

    @Test
    public void testFindAnimal() {
        Animal a = animalRepository.findById(1L).get();
        System.out.println(a);
    }

    @Test
    public void testUpdateAnimal() {
        Animal a = animalRepository.findById(1L).get();
        a.setAge(3);
        animalRepository.save(a);
    }

    @Test
    public void testDeleteAnimal() {
        animalRepository.deleteById(1L);
    }

    @Test
    public void testListerTousAnimaux() {
        List<Animal> animaux = animalRepository.findAll();

        for (Animal a : animaux) {
            System.out.println(a);
        }
    }
}
