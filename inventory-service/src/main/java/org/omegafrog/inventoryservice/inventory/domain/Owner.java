package org.omegafrog.inventoryservice.inventory.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Owner {

	@Embedded
	private OwnerId ownerId;
	private String userName;
	private String userEmail;

	public Owner() {
	}

	public Owner(OwnerId ownerId, String userName, String userEmail) {
		this.ownerId = ownerId;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public OwnerId getOwnerId() {
		return ownerId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}
}
