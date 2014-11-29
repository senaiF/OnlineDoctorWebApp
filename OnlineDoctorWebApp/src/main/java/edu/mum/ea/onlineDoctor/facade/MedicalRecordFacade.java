/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.facade;

import edu.mum.ea.onlineDoctor.entity.MedicalRecord;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fetiya
 */
@Stateless
public class MedicalRecordFacade extends AbstractFacade<MedicalRecord> {
    @PersistenceContext(unitName = "edu.mum.ea_OnlineDoctorWebApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedicalRecordFacade() {
        super(MedicalRecord.class);
    }
    
}
