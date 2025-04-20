package org.omegafrog.orderservice.domain;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {
	private Long id;
	private String ordererName;
	private String ordererEmail;
	private int totalAmount;
	private List<OrderLineDto> orderLines;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;

	public OrderDto() {
	}

	public Long getId() {
		return id;
	}

	public String getOrdererName() {
		return ordererName;
	}

	public String getOrdererEmail() {
		return ordererEmail;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public List<OrderLineDto> getOrderLines() {
		return orderLines;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public OrderDto(Long id, String ordererName, String ordererEmail, int totalAmount, List<OrderLineDto> orderLines,
		LocalDateTime createdAt, LocalDateTime modifiedAt) {
		this.id = id;
		this.ordererName = ordererName;
		this.ordererEmail = ordererEmail;
		this.totalAmount = totalAmount;
		this.orderLines = orderLines;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public OrderDto(Order order){
		this.id = order.getId();
		this.createdAt = order.getCreatedAt();
		this.ordererEmail = order.getOrderer().getEmail();
		this.ordererName = order.getOrderer().getName();
		this.orderLines = order.getOrderLines().stream().map(OrderLineDto::new).toList();
		this.totalAmount = order.getOrderLines().stream().mapToInt(orderline -> orderline.getAmounts()).sum();
	}
}

