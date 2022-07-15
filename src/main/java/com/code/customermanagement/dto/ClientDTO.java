package com.code.customermanagement.dto;

import com.code.customermanagement.entity.City;

import java.io.Serializable;

public class ClientDTO implements Serializable {

    /**
     *
     * Client data transfer object
     */
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private City city;

    public ClientDTO() { }

    public ClientDTO(String firstName, String lastName, String phoneNumber, String email, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
    }

    public Integer getId() {
        return id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
