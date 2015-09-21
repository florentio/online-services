/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.gestionPersonnelModule;

import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author Gildasdarex
 */
public class Employe {
    //il de la personne
    private String personnePhysique;
    private String dep;
    private String plateformeUsername;
    private String plateformePassword;
    @OneToMany(mappedBy = "employe")
    private List<EmployeDepartement> departements;
}
