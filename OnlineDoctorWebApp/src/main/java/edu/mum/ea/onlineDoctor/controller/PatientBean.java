/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.controller;

import edu.mum.ea.onlineDoctor.entity.Patient;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Fetiya
 */
@Named(value = "patientBean")
@SessionScoped
public class PatientBean {

   @EJB
   private PatientFacade patientFacacde;
   
    private Patient patient;
    
    public PatientBean() {
        this.patient=new Patient();
    }

    public PatientFacade getPatientFacacde() {
        return patientFacacde;
    }

    public void setPatientFacacde(PatientFacade patientFacacde) {
        this.patientFacacde = patientFacacde;
    }

    public Patient getPatient() {
        return patient;
    }

//    public void setPatient(Patient patient) {
//        this.patient = patient;
//       
//    }
    
    
    public String updatePatient()
    {
        
        patientFacacde.edit(patient);
        
        return "patientInfoSuccess";
    }
    
}
