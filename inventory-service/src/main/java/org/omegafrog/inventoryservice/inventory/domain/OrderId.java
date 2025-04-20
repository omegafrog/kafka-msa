package org.omegafrog.inventoryservice.inventory.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderId {
	@Column(name = "order_id")
	private Long value;

	public OrderId(Long value) {
		this.value = value;
	}

	public OrderId() {
	}

	public Long getValue() {
		return value;
	}
}
