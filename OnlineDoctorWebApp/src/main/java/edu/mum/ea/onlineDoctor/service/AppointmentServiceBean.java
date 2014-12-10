/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.service;

import edu.mum.ea.onlineDoctor.entity.Appointment;
import edu.mum.ea.onlineDoctor.entity.Patient;
import edu.mum.ea.onlineDoctor.facade.AppointmentFacade;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import edu.mum.ea.onlineDoctor.serviceI.AppointmentServiceBeanLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Fetiya
 */
@Stateless
public class AppointmentServiceBean implements AppointmentServiceBeanLocal {

    
    @EJB
    private AppointmentFacade appointmentFacacde;

    
    @Override
    public String createAppointment(Appointment appointment) {

        appointmentFacacde.create(appointment);
        
        return "";
    }
    @Override
    public List<Appointment> findAllAppointments() {
     
        List<Appointment> apps= appointmentFacacde.findAll();
        
        return apps;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Appointment> findPatientAppointments(Patient patient) {
       
        return appointmentFacacde.findPatientAppointments(patient);
    }
}
