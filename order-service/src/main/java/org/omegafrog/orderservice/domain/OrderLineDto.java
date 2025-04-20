package org.omegafrog.orderservice.domain;

public class OrderLineDto {
	private String productName;
	private int quantity;
	private int amounts;

	public OrderLineDto() {
	}

	public OrderLineDto(String productName, int quantity, int amounts) {
		this.productName = productName;
		this.quantity = quantity;
		this.amounts = amounts;
	}

	public OrderLineDto(OrderLine orderLine){
		this.amounts = orderLine.getAmounts();
		this.quantity = orderLine.getQuantity();
		this.productName = orderLine.getProductName();
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
