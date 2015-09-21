/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.personneModuleV1;

import com.braintech.online.service.entity.personneModuleV2.Personne;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Gildasdarex
 */
public class PersonMorale extends Person {
      private String pays;
      private List<SecteurActivite> secteurs;
      private List<PersonMoraleParam> informations;
}
