	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braintech.online.service.entity.personneModuleV1;

import com.braintech.online.service.entity.personneModuleV2.ContactParam;
import java.util.List;

/**
 *
 * @author Gildasdarex
 */
 /*
 Cette classe permet de definir les différents composants d'un contact
 param peut prendre comme valeur : telephone fixe, telephone mobile, etc suivant la configuration des informations
 d'une personne dont l'entreprise a besoin
 */
public class ContactConfig {
  private String param;
  private boolean unique;
}
