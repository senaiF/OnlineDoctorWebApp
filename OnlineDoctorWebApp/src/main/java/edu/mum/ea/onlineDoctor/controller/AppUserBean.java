/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.controller;

import edu.mum.ea.onlineDoctor.entity.AppUser;
import edu.mum.ea.onlineDoctor.facade.AppUserFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

/**
 *
 * @author Stella
 */

@Stateless
public class AppUserBean {

    @EJB
    private AppUserFacade appUserFacade;

    private AppUser appUser;    
    private boolean loggedIn;

//    private Address address;
//
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public AppUserFacade getSystemUserFacade() {
        return appUserFacade;
    }

    public void setSystemUserFacade(AppUserFacade systemUserFacade) {
        this.appUserFacade = systemUserFacade;
    }

    public AppUser getSystemUser() {
        return appUser;
    }

    public void setSystemUser(AppUser systemUser) {
        this.appUser = systemUser;
    }

    public AppUserBean() {
//        this.address=new Address();
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String login() {

//        List<SystemUser> users = appUserFacade.findAll();//factory.getUserDAO().findAll(0, 100)
//        for (SystemUser u : users) {
//            if (user.getUserName().equals(u.getUserName())) {
//                if (user.getPassword().equals(u.getPassword())) {
//                    loggedUserId = u.getId();
//                    loggedIn = true;
//                    FacesContext context = FacesContext.getCurrentInstance();
//                    context.getExternalContext().getSessionMap().put("LoggedInUser", u);
//                    return "home";
//                }
//            }
//        }
//        FacesContext.getCurrentInstance().addMessage("frmLogin:login", new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Wrong username or password!"));
       return "index";

    }

    public String logout() {
        loggedIn = false;
        return "index";
    }

    public void checkLogin(ComponentSystemEvent event) {

        if (!loggedIn) {

            FacesContext context = FacesContext.getCurrentInstance();

            ConfigurableNavigationHandler handler = (ConfigurableNavigationHandler) context.getApplication().getNavigationHandler();

            handler.performNavigation("login");

        }
    }
    
    
}
