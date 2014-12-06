/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlinedoctor;

import static com.sun.javafx.application.PlatformImpl.startup;
import edu.mum.ea.onlineDoctor.entity.Address;
import edu.mum.ea.onlineDoctor.entity.Administrator;
import edu.mum.ea.onlineDoctor.facade.AddressFacade;
import edu.mum.ea.onlineDoctor.facade.AdministratorFacade;
import edu.mum.ea.onlineDoctor.facade.SystemUserFacade;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Senai
 */

@Singleton
@Startup
public class DatabaseInitializer implements Serializable {

    @EJB
    private static AdministratorFacade adminFacade;
    private static AddressFacade addressFacade;

    public static void main(String[] args) {

        Administrator admin1 = new Administrator();
        admin1.setUserName("Admin");
        admin1.setUserPassword("admin");
        admin1.setFirstName("Stive");
        admin1.setLastName("Nolle");
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

        adminFacade.create(admin1);

    }
}
