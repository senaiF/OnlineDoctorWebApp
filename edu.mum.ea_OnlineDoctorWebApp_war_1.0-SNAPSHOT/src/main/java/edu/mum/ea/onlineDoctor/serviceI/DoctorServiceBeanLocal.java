/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.serviceI;

import edu.mum.ea.onlineDoctor.entity.Doctor;
import javax.ejb.Local;

/**
 *
 * @author Senai
 */
@Local
public interface DoctorServiceBeanLocal {
    
    public Doctor getDoctorById(Long id);
}