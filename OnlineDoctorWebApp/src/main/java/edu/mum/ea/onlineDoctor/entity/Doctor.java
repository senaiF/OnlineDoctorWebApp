/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.ea.onlineDoctor.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


/**
 *
 * @author HailelulLakew
 */
@Entity
public class Doctor extends SystemUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String staffId;
    /*the join table between Doctor and Specialization is renamed to JND_DOCT_SPEC 
     as well as each join column (thanks to the @JoinTable annotation).
     The joinColumns element refers to the owning side (the Doctor)
     and the inverseJoinColumns refers to the inverse owning
     side (the Specialization)*/
    @ManyToMany
    @JoinTable(name = "jnd_doct_spec",joinColumns = @JoinColumn(name = "doctor_fk"),
    inverseJoinColumns = @JoinColumn(name = "specialization_ID"))  
    private List<Specialization> specializaions;    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_fk")
    private List<MedicalRecord> medicalRecords;
    @OneToMany(mappedBy = "doctorInAppointment")
    private List<Appointment> appointments;
    

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     /**
     * @return the staffId
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * @param staffId the staffId to set
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    /**
     * @return the specializations
     */
    
    /**
     * @return the medicalRecords
     */
    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    /**
     * @param medicalRecords the medicalRecords to set
     */
    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    

    /**
     * @return the specializaions
     */
    public List<Specialization> getSpecializaions() {
        return specializaions;
    }

    /**
     * @param specializaions the specializaions to set
     */
    public void setSpecializaions(List<Specialization> specializaions) {
        this.specializaions = specializaions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.mum.ea.onlineDoctor.entity.Doctor[ id=" + id + " ]";
    }

    

   
    
}
