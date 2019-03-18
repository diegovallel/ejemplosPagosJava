/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.pagosmaestria.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Rosita
 */
public class captcha {

  public void check(ActionEvent e){
  FacesContext
 .getCurrentInstance()
 .addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Su Codigo es correcto",null));
  }  
    
    
    /**
     * Creates a new instance of captcha
     */
    public captcha() {
    }
    
}
