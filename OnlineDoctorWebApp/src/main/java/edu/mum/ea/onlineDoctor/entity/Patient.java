/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.ea.onlineDoctor.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Stella
 */
@Entity
public class Patient extends AppUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "patientInAppointment")
    private List<Appointment> appointments;
    @OneToMany(mappedBy = "patient" )//patientInMedicalRecord")
    private List<MedicalRecord> medicalHistory;

    public List<Appointment> getAppoiintments() {
        return appointments;
    }

    public void setAppoiintments(List<Appointment> appoiintments) {
        this.appointments = appoiintments;
    }

    public List<MedicalRecord> getMedicalRecord() {
        return medicalHistory;
    }

    public void setMedicalRecord(List<MedicalRecord> medicalRecord) {
        this.medicalHistory = medicalRecord;
    }

    public Patient() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.appointments);
        hash = 37 * hash + Objects.hashCode(this.medicalHistory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.appointments, other.appointments)) {
            return false;
        }
        if (!Objects.equals(this.medicalHistory, other.medicalHistory)) {
            return false;
        }
        return true;
    }
    
    
   

    }
