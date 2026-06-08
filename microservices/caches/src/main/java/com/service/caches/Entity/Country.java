package com.service.caches.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "name")
    private String name;

    public Country() {
    }

    public Country(String countryCode, String name) {
        this.countryCode = countryCode;
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}