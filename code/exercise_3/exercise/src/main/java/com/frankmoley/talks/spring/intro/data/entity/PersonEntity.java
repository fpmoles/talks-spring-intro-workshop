package com.frankmoley.talks.spring.intro.data.entity;

/**
 * The Person Entity represents the user in the system. Each person will have the ability to log into inventory one or more items.
 */
public class PersonEntity {
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
