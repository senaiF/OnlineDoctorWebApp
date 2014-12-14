/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Stella
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {

            session.invalidate();
        }
        return "/index?faces-redirect=true";

    }

//    private static Logger log = Logger.getLogger(LoginBean.class.getName());
//
//    public String logout() {
//        String result = "/index?faces-redirect=true";
//
//        FacesContext context = FacesContext.getCurrentInstance();
//        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
//
//        try {
//            request.logout();
//        } catch (ServletException e) {
//            log.log(Level.SEVERE, "Failed to logout user!", e);
//            result = "/loginError?faces-redirect=true";
//        }
//
//        return result;
//    }
}
