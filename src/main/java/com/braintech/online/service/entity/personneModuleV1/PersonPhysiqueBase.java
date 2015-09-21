/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.personneModuleV1;

import java.util.Date;

/**
 *
 * @author Gildasdarex
 */
public class PersonPhysiqueBase extends Person{
    private String lastname;
    private String firstname;
    private Date birthday;
    private String sex;
    private String nationality;
    private String birthPlace;
    private double weight;
    private double taille;
    private String situationMatrimoniale;
    private List<PersonPhysiqueParam> informations;


}
