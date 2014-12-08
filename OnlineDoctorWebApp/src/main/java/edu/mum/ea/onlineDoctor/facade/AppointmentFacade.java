/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.facade;

import edu.mum.ea.onlineDoctor.entity.Appointment;
import edu.mumea.onlineDoctor.service.AppointmentServiceBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static javafx.scene.input.KeyCode.T;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Stella
 */
@Stateless
public class AppointmentFacade extends AbstractFacade<Appointment> {
    @PersistenceContext(unitName = "edu.mum.ea_OnlineDoctorWebApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;
    @EJB
    AppointmentServiceBean appointmentServiceBean;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    

    public AppointmentFacade() {
        super(Appointment.class);
    }
    
    public void create(Appointment entity) {
        getEntityManager().persist(entity);
        //appointmentServiceBean.create(entity);
    }
    
    
    
    
}
