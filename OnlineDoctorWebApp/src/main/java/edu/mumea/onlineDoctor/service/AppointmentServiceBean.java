/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mumea.onlineDoctor.service;

import edu.mum.ea.onlineDoctor.entity.Appointment;
import edu.mum.ea.onlineDoctor.facade.AppointmentFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author HailelulLakew
 */
@Stateless
public class AppointmentServiceBean {
    @EJB 
 private AppointmentFacade appointmentFacade;
    
   public void create(Appointment entity) {
       appointmentFacade.create(entity);
    } 

    /**
     * @return the appointmentFacade
     */
    public AppointmentFacade getAppointmentFacade() {
        return appointmentFacade;
    }

    /**
     * @param appointmentFacade the appointmentFacade to set
     */
    public void setAppointmentFacade(AppointmentFacade appointmentFacade) {
        this.appointmentFacade = appointmentFacade;
    }
}
