/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.pagosmaestria.controller;

import com.udea.pagosmaestria.ejb.PaymentFacadeLocal;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;

/**
 *
 * @author Rosita
 */
public class PaymentBean implements Serializable {
    @EJB
    private PaymentFacadeLocal paymentFacade;
//Para manipular el boton de pagar (enable o disable)
private UIComponent mybutton;
//Defino los atributos de la vista
private int id;
private double amount;
private long card;
private Date date=new Date();
private int cvvNo;
private String contrasenia;
private String txtContraseniaRepita;
private boolean disable=true; //cuando se incializa la vista 
                      //el boton de pago esta desabilitado
private String sSubCadena;//para coger los 4 digitos de card
private String mensajecard;//mensaje del tipo de tarjeta de credito
private String m; //variable de apoyo



    
    
    
    /**
     * Creates a new instance of PaymentBean
     */
    public PaymentBean() {
    }

    /**
     * @return the paymentFacade
     */
    public PaymentFacadeLocal getPaymentFacade() {
        return paymentFacade;
    }

    /**
     * @param paymentFacade the paymentFacade to set
     */
    public void setPaymentFacade(PaymentFacadeLocal paymentFacade) {
        this.paymentFacade = paymentFacade;
    }

    /**
     * @return the mybutton
     */
    public UIComponent getMybutton() {
        return mybutton;
    }

    /**
     * @param mybutton the mybutton to set
     */
    public void setMybutton(UIComponent mybutton) {
        this.mybutton = mybutton;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the card
     */
    public long getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(long card) {
        this.card = card;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the cvvNo
     */
    public int getCvvNo() {
        return cvvNo;
    }

    /**
     * @param cvvNo the cvvNo to set
     */
    public void setCvvNo(int cvvNo) {
        this.cvvNo = cvvNo;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the txtContraseniaRepita
     */
    public String getTxtContraseniaRepita() {
        return txtContraseniaRepita;
    }

    /**
     * @param txtContraseniaRepita the txtContraseniaRepita to set
     */
    public void setTxtContraseniaRepita(String txtContraseniaRepita) {
        this.txtContraseniaRepita = txtContraseniaRepita;
    }

    /**
     * @return the disable
     */
    public boolean isDisable() {
        return disable;
    }

    /**
     * @param disable the disable to set
     */
    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    /**
     * @return the sSubCadena
     */
    public String getsSubCadena() {
        return sSubCadena;
    }

    /**
     * @param sSubCadena the sSubCadena to set
     */
    public void setsSubCadena(String sSubCadena) {
        this.sSubCadena = sSubCadena;
    }

    /**
     * @return the mensajecard
     */
    public String getMensajecard() {
        return mensajecard;
    }

    /**
     * @param mensajecard the mensajecard to set
     */
    public void setMensajecard(String mensajecard) {
        this.mensajecard = mensajecard;
    }

    /**
     * @return the m
     */
    public String getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(String m) {
        this.m = m;
    }
    
}
