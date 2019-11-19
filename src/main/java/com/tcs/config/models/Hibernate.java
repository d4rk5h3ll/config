/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.config.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nil
 */
@Entity
@Table(name = "hibernate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hibernate.findAll", query = "SELECT h FROM Hibernate h")
    , @NamedQuery(name = "Hibernate.findByIdHibernate", query = "SELECT h FROM Hibernate h WHERE h.idHibernate = :idHibernate")
    , @NamedQuery(name = "Hibernate.findByFirstName", query = "SELECT h FROM Hibernate h WHERE h.firstName = :firstName")
    , @NamedQuery(name = "Hibernate.findByLastName", query = "SELECT h FROM Hibernate h WHERE h.lastName = :lastName")
    , @NamedQuery(name = "Hibernate.findByPhone", query = "SELECT h FROM Hibernate h WHERE h.phone = :phone")
    , @NamedQuery(name = "Hibernate.findByEmail", query = "SELECT h FROM Hibernate h WHERE h.email = :email")
    , @NamedQuery(name = "Hibernate.findByGender", query = "SELECT h FROM Hibernate h WHERE h.gender = :gender")
    , @NamedQuery(name = "Hibernate.findByDob", query = "SELECT h FROM Hibernate h WHERE h.dob = :dob")})
public class Hibernate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hibernate")
    private Integer idHibernate;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 13)
    @Column(name = "phone")
    private String phone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 6)
    @Column(name = "gender")
    private String gender;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    public Hibernate() {
    }

    public Hibernate(Integer idHibernate) {
        this.idHibernate = idHibernate;
    }

    public Integer getIdHibernate() {
        return idHibernate;
    }

    public void setIdHibernate(Integer idHibernate) {
        this.idHibernate = idHibernate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHibernate != null ? idHibernate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hibernate)) {
            return false;
        }
        Hibernate other = (Hibernate) object;
        if ((this.idHibernate == null && other.idHibernate != null) || (this.idHibernate != null && !this.idHibernate.equals(other.idHibernate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tcs.config.models.Hibernate[ idHibernate=" + idHibernate + " ]";
    }
    
}
