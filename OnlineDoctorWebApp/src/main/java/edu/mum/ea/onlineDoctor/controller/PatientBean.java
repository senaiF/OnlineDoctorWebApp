/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.controller;

import edu.mum.ea.onlineDoctor.entity.Address;
import edu.mum.ea.onlineDoctor.entity.AppRole;
import edu.mum.ea.onlineDoctor.entity.Credential;
import edu.mum.ea.onlineDoctor.entity.Patient;
import edu.mum.ea.onlineDoctor.facade.AddressFacade;
import edu.mum.ea.onlineDoctor.facade.AppRoleFacade;
import edu.mum.ea.onlineDoctor.facade.CredentialFacade;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import edu.mum.ea.onlineDoctor.service.PatientServiceBean;
import edu.mum.ea.onlineDoctor.serviceI.PatientServiceBeanLocal;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author Fetiya
 */
@Named
@RequestScoped
public class PatientBean implements Serializable {

//    @EJB
//    private AddressFacade addressFacade;
//
//    @EJB
//    private PatientFacade patientFacacde;
    
    @EJB
    private PatientServiceBeanLocal patientService;
    @EJB
    private AppRoleFacade roleFacade;
    @EJB
    private CredentialFacade credentialfacade;

    private Address address;

    private Patient patient;
    private AppRole role;
    private Credential credential;

    public PatientBean() {

    }

    @PostConstruct
    public void init() {
        this.patient = new Patient();
        address = new Address();
        this.role=roleFacade.find("Patient");
        this.credential=new Credential();
        
        

    }
//
//    public PatientFacade getPatientFacacde() {
//        return patientFacacde;
//    }
//
//    public void setPatientFacacde(PatientFacade patientFacacde) {
//        this.patientFacacde = patientFacacde;
//    }

    public CredentialFacade getCredentialfacade() {
        return credentialfacade;
    }

    public void setCredentialfacade(CredentialFacade credentialfacade) {
        this.credentialfacade = credentialfacade;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public PatientServiceBeanLocal getPatientService() {
        return patientService;
    }

    public void setPatientService(PatientServiceBeanLocal patientService) {
        this.patientService = patientService;
    }

    public AppRoleFacade getRoleFacade() {
        return roleFacade;
    }

    public void setRoleFacade(AppRoleFacade roleFacade) {
        this.roleFacade = roleFacade;
    }

   
    
    public String updatePatient() {

//        patientFacacde.edit(patient);

        return "patientInfoSuccess";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
//     public void validate(FacesContext arg0, UIComponent arg1, Object brandName)
//            throws ValidatorException {
//        Credential credential1 = null;
//        try{
//            credential1 = credentialfacade.f.getBrandByBrandName(brandName.toString());
//        }
//        catch(Exception ex){}
//        if(brand != null){
//            tempBean.setBrandDescription(brand.getBrandDescription());
//            tempBean.setBrandName(brand.getBrandName());
//            tempBean.setBrandId(brand.getBrandId());
//            FacesMessage msg = 
//                    new FacesMessage("Already Exists", 
//                            "Re-Enter Brand Name");
//                msg.setSeverity(FacesMessage.SEVERITY_ERROR);
//                throw new ValidatorException(msg);
//        }

//    }

    public String addPatient() {
//        System.out.println("pre save method");
//        patientFacacde.create(patient);
        
        patient.setCredential(credential);
        credential.setRole(role);
        patient.setAddress(address);
        String sinupresualt=patientService.signupPatient(patient);
       
//        System.out.println("post save method");
    if(sinupresualt!=null){
        return "patientInfoSuccess";
    }
 return "";
    }
}
