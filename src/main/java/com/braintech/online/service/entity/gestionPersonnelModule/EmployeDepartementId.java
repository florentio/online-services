/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.gestionPersonnelModule;

import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 *
 * @author Gildasdarex
 */
@Embeddable
public class EmployeDepartementId {
    
    private String employeId;
    private String departementId;
}
