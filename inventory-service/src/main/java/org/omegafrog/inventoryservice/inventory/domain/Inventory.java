package org.omegafrog.inventoryservice.inventory.domain;


import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Owner owner;

	@ElementCollection
	@CollectionTable(
		name = "inventory_items",
		joinColumns = @JoinColumn(name = "order_id")
	)
	private List<OrderId> orders;

	public Inventory() {
	}

	public Inventory(Owner owner, List<OrderId> orders) {
		this.owner = owner;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public Owner getOwner() {
		return owner;
	}

	public List<OrderId> getOrders() {
		return orders;
	}
}
