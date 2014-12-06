/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.controller;

import edu.mum.ea.onlineDoctor.entity.Patient;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Fetiya
 */
@ManagedBean
@SessionScoped
public class EditPatientBean implements Serializable {

   @EJB
   private PatientFacade patientFacacde;
    
    private Patient patient=new Patient() ;//(Patient)patientFacacde.find(3);
    
    public EditPatientBean() {
       
          
        //   Patient patient2 =;
       
    }
@PostConstruct
private void init(){
    Long id= Long.valueOf(1);
     patient=  patientFacacde.find(id);
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

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    public String updatePatient()
    {
     
     
        patientFacacde.edit(patient);
       
        return "patientInfoSuccess";
    }
    
}
