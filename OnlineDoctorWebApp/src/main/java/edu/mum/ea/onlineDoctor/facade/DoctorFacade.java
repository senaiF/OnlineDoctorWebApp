/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.facade;

import edu.mum.ea.onlineDoctor.entity.Doctor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HailelulLakew
 */
@Stateless
public class DoctorFacade extends AbstractFacade<Doctor> {
    @PersistenceContext(unitName = "edu.mum.ea_OnlineDoctorWebApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DoctorFacade() {
        super(Doctor.class);
    }
    
}
