package com.service.caches.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "state", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"state_code", "country_code"})
})
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "state_code", nullable = false)
    private String stateCode;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "country_code", nullable = false)
    private String countryCode;

    public State() {
    }

    public State(String stateCode, String stateName, String countryCode) {
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.countryCode = countryCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}