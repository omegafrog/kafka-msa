package org.omegafrog.inventoryservice.inventory.domain;

import java.util.List;

public class InventoryDto {
	private Long id;
	private OwnerId ownerId;
	private String ownerName;
	private String ownerEmail;
	private List<OrderId> orders;

	public InventoryDto() {
	}

	public InventoryDto(Long id, OwnerId ownerId, String ownerName, String ownerEmail, List<OrderId> orders) {
		this.id = id;
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.orders = orders;
	}

	public InventoryDto(Inventory inventory){
		this(inventory.getId(), inventory.getOwner().getOwnerId(),
			inventory.getOwner().getUserName(), inventory.getOwner().getUserEmail(),
			inventory.getOrders());
	}

}
