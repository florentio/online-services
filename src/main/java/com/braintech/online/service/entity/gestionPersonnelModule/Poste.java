/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.gestionPersonnelModule;

import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Gildasdarex
 */
public class Poste {
    private String libelle;
    private String description;
    @ManyToOne
    private Poste superieur;
    @OneToMany(mappedBy = "superieur")
    private List<Poste> subordonnees;
}
