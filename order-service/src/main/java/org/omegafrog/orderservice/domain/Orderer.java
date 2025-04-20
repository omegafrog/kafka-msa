package org.omegafrog.orderservice.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Orderer {
	private String name;
	private String email;

	public Orderer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Orderer() {
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
