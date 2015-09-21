/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.gestionPersonnelModule;

import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Gildasdarex
 */
public class EmployeDepartement {
   
    @EmbeddedId
    private EmployeDepartementId id;
    
    private Poste poste;
    
    private EmploiDuTemps emploiDuTemps;
    
    private String employeDepartementUsername;
    
    private String employeDepartementPassword;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="EMPLOYEID", referencedColumnName = "ID")
    private Employe employe;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="PROJECTID", referencedColumnName = "ID")
    private Departement departement;
   
}
