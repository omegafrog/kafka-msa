package org.omegafrog.orderservice.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderLine {
	private String productName;
	private int quantity;
	private int amounts;

	public OrderLine(String productName, int quantity, int amounts) {
		this.productName = productName;
		this.quantity = quantity;
		this.amounts = amounts;
	}

	public OrderLine() {
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getAmounts() {
		return amounts;
	}
}
