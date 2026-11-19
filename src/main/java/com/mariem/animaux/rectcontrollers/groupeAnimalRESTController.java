package com.mariem.animaux.rectcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariem.animaux.entities.GroupeAnimal;
import com.mariem.animaux.repos.GroupeAnimalRepository;

@RestController
@RequestMapping("/api/groupe")
@CrossOrigin("*")
public class groupeAnimalRESTController {

    @Autowired
    GroupeAnimalRepository groupeAnimalRepository;

    // Afficher tous les groupes
    @RequestMapping(method = RequestMethod.GET)
    public List<GroupeAnimal> getAllGroupes() {
        return groupeAnimalRepository.findAll();
    }

    // Consulter un groupe par ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public GroupeAnimal getGroupeById(@PathVariable("id") Long id) {
        return groupeAnimalRepository.findById(id).get();
    }

    // Ajouter un groupe
    @RequestMapping(method = RequestMethod.POST)
    public GroupeAnimal ajouterGroupe(@RequestBody GroupeAnimal groupe) {
        return groupeAnimalRepository.save(groupe);
    }

    // Modifier un groupe
    @RequestMapping(method = RequestMethod.PUT)
    public GroupeAnimal modifierGroupe(@RequestBody GroupeAnimal groupe) {
        return groupeAnimalRepository.save(groupe);
    }

    // Supprimer un groupe
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void supprimerGroupe(@PathVariable("id") Long id) {
        groupeAnimalRepository.deleteById(id);
    }
}
