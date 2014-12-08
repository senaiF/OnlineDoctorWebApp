/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.controller;

import edu.mum.ea.onlineDoctor.entity.Address;
import edu.mum.ea.onlineDoctor.entity.Patient;
import edu.mum.ea.onlineDoctor.facade.AddressFacade;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Fetiya
 */
@ManagedBean
@SessionScoped
public class PatientBean implements Serializable{
    @EJB
    private AddressFacade addressFacade;

   @EJB
   private PatientFacade patientFacacde;
   
   
    private Patient patient;
    
    private Address address;
    
    public PatientBean() {
        
    }
    
    @PostConstruct
    public void init()
    {
       this.patient=new Patient(); 
       address= new Address();
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
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    public String updatePatient()
    {
        
        patientFacacde.edit(patient);
        
        return "patientInfoSuccess";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
        public String addPatient(){
         System.out.println("pre save method");
          patient.setAddress(address);
          patientFacacde.create(patient);
         System.out.println("post save method");
       return "patientInfoSuccess";
    }
    
}
