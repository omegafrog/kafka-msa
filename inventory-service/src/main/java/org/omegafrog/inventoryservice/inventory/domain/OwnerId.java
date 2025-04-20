package org.omegafrog.inventoryservice.inventory.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OwnerId {
	@Column(name = "owner_id")
	private Long value;

	public OwnerId(Long value) {
		this.value = value;
	}

	public OwnerId() {
	}

	public Long getValue() {
		return value;
	}

}
