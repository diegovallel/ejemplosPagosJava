/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.pagosmaestria.ejb;

import com.udea.pagosmaestria.modelo.Payment;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rosita
 */
@Stateless
public class PaymentFacade extends AbstractFacade<Payment> implements PaymentFacadeLocal {
    @PersistenceContext(unitName = "com.udea_PagosMaestria_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaymentFacade() {
        super(Payment.class);
    }
    
}
