/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompagny.projet.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "client")
public class Client {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(table = "client", name = "id_client", unique = true)
    private Long clientId;
    
    @Column(table = "client", name = "lastname")
    private String lastName;
    
    @Column(table = "client", name = "firstname")
    private String firstName;
    
    @Column(table = "client", name = "address")
    private String address;
    
    @Column(table = "client", name = "phone")
    private String phone;
    
    @Column(table = "client", name = "email")
    private String email;
    
    @Column(table = "client", name = "course_session_id")
    private Long clientSessionId;
    
    @Column(table = "client", name = "password")
    private String password;

    public Client(String lastName, String firstName, String address, String phone, String email, Long clientSessionId, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.clientSessionId = clientSessionId;
        this.password = password;
    }
    
    public Client(){
    }

    public Long getClientId() {
        return clientId;
    }

    private void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Long getClientSessionId() {
        return clientSessionId;
    }

    public void setClientSessionId(Long clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.clientId, other.clientId)) {
            return false;
        }
        if (!Objects.equals(this.clientSessionId, other.clientSessionId)) {
            return false;
        }
        return true;
    }

    
    
}