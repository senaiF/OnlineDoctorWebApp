/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.service;

/**
 *
 * @author Fetiya
 */
import java.util.Date;
 
public class ChatMessage {
	private String message;
	private String sender;
	private Date received;

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    @Override
    public String toString() {
        
        System.out.println("ChatMessage{" + "message=" + message + ", sender=" + sender + ", received=" + received + '}');
        return "ChatMessage{" + "message=" + message + ", sender=" + sender + ", received=" + received + '}';
    }
 
	
    
}