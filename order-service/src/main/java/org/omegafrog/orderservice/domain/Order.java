package org.omegafrog.orderservice.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity(name = "orders")
@EntityListeners(AuditingEntityListener.class)
public class Order {
	@Embedded
	private Orderer orderer;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ElementCollection
	@CollectionTable(
		name = "order_lines",
		joinColumns = @JoinColumn(name="order_number")
	)
	private List<OrderLine> orderLines;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime modifiedAt;

	public Order(Orderer orderer, List<OrderLine> orderLines) {
		this.orderer = orderer;
		this.orderLines = orderLines;
	}

	public Order() {
	}

	public Orderer getOrderer() {
		return orderer;
	}

	public Long getId() {
		return id;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Order order))
			return false;
		return Objects.equals(id, order.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
