package com.tts2.h2explorer.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String firstName;
    private String lastName;

    public Customer() { // default contructor

    }
    
    public Customer(String firstName, String lastName) { // contructor
        this.firstName = firstName;
        this.lastName = lastName;

    }


	public Long getId() {
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

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
	}

}
