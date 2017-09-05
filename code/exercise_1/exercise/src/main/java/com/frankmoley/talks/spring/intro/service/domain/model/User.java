package com.frankmoley.talks.spring.intro.service.domain.model;

/**
 * A specific user in the system
 */
public class User {
    private String username;
    private String personId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
