/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.service;

import edu.mum.ea.onlineDoctor.entity.Patient;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Senai
 */
@Stateless
public class PatientServiceBean {

    @EJB
    private PatientFacade patientFacacde;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String signupPatient(Patient newPatient) {

        patientFacacde.create(newPatient);
        
        return "";
    }

}
