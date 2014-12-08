/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.service;

import edu.mum.ea.onlineDoctor.entity.Address;
import edu.mum.ea.onlineDoctor.entity.Administrator;
import edu.mum.ea.onlineDoctor.entity.Gender;
import edu.mum.ea.onlineDoctor.facade.AddressFacade;
import edu.mum.ea.onlineDoctor.facade.AdministratorFacade;
import edu.mum.ea.onlineDoctor.facade.DoctorFacade;
import edu.mum.ea.onlineDoctor.facade.PatientFacade;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Senai
 */
//@Singleton
//@Startup
//@DependsOn("AdministratorFacade")
public class DatabaseInitializer {

//    @Inject
//    private AdministratorFacade adminFacade;
//    @Inject
//    private AddressFacade addressFacade;
//    @Inject
//    private DoctorFacade doctorFacade;
//    @Inject
//    private PatientFacade patientFacade;
  
//    @PersistenceContext(unitName = "edu.mum.ea_OnlineDoctorWebApp_war_1.0-SNAPSHOTPU")
   
    @PostConstruct
    private void init() {
        System.out.println("I am in Database Initializer Singletonnnnnnnnnnnnnnnnnnnn");
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.mum.ea_OnlineDoctorWebApp_war_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager(); 

//        EntityManagerFactory emf=new EntityManagerFactory();
        Administrator admin1 = new Administrator();
        admin1.setUserName("Admin");
        admin1.setUserPassword("admin");
        admin1.setFirstName("Stive");
        admin1.setLastName("Nolle");
        admin1.setGender(Gender.Male);
        admin1.setDateofBirth(new Date(1950, 12, 23));
        admin1.setCellPhoneNo("001(641)483-8745");
        admin1.setHomePhoneNo("001(641)546-2345");
        admin1.setWorkPhoneNo("001(641)893-2345");

        Address adminAddress = new Address();
        adminAddress.setStreet("4th street");
        adminAddress.setCity("Fairfield");
        adminAddress.setState("Iowa");
        adminAddress.setZipCode("55257");
        
        admin1.setAddress(adminAddress);
        em.persist(admin1);
//        this.adminFacade.create(admin1);

    }
}
