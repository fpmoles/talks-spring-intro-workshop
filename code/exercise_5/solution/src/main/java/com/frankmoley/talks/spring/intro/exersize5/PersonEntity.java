package com.frankmoley.talks.spring.intro.exersize5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Person Entity represents the user in the system. Each person will have the ability to log into inventory one or more items.
 */
@Entity
@Table(name="PERSON")
public class PersonEntity {
    @Id
    @GeneratedValue
    @Column(name="PERSON_ID")
    private long id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL_ADDRESS")
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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonEntity{");
        sb.append("emailAddress='").append(emailAddress).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", id=").append(id);
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
