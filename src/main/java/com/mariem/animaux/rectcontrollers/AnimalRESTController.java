
package com.mariem.animaux.rectcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mariem.animaux.entities.Animal;
import com.mariem.animaux.service.AnimalService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AnimalRESTController {

    @Autowired
    AnimalService animalService;

    @GetMapping()
    public List<Animal> getAllAnimaux() {
        return animalService.getAllAnimaux();
    }

    //@RequestMapping(value="/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable("id") Long id) {
        return animalService.getAnimal(id);
    }
    @PostMapping()
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }
    @PutMapping()
    public Animal updateAnimal(@RequestBody Animal animal) {
        return animalService.updateAnimal(animal);
    }
    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable("id") Long id) {
        animalService.deleteAnimalById(id);
    }
    @GetMapping("/animauxGroupe/{idGroupe}")
    public List<Animal> getAnimauxByGroupeId(@PathVariable("idGroupe") Long idGroupe) {
        return animalService.findByGroupeAnimalIdGroupe(idGroupe);
    }
    
}
