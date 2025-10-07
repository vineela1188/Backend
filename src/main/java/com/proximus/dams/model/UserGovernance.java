package com.proximus.dams.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table
public class UserGovernance {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String fullName;
    private String emailAddress;
    private String role;
    private String groups;
    private String status;

    public UserGovernance(Long id, String userName, String fullName, String emailAddress, String role, String groups, String status) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.role = role;
        this.groups = groups;
        this.status = status;
    }

    public UserGovernance() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
