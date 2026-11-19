package com.mariem.animaux.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimal;

    private String nomAnimal;
    private String espece;
    private int age;
    private Date dateNaissance;

    @ManyToOne
    @JoinColumn(name = "id_groupe")
    private GroupeAnimal groupeAnimal;

    public Animal() {
        super();
    }

    public Animal(String nomAnimal, String espece, int age,
                  Date dateNaissance) {
        super();
        this.nomAnimal = nomAnimal;
        this.espece = espece;
        this.age = age;
        this.dateNaissance = dateNaissance;
    }
    public Animal(String nomAnimal, String espece, int age,
            Date dateNaissance, GroupeAnimal groupeAnimal) {
		  this.nomAnimal = nomAnimal;
		  this.espece = espece;
		  this.age = age;
		  this.dateNaissance = dateNaissance;
		  this.groupeAnimal = groupeAnimal;
}

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public GroupeAnimal getGroupeAnimal() {
        return groupeAnimal;
    }

    public void setGroupeAnimal(GroupeAnimal groupeAnimal) {
        this.groupeAnimal = groupeAnimal;
    }

    @Override
    public String toString() {
        return "Animal [idAnimal=" + idAnimal
                + ", nomAnimal=" + nomAnimal
                + ", espece=" + espece
                + ", age=" + age
                + ", dateNaissance=" + dateNaissance
                + "]";
    }
}