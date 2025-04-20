package org.omegafrog.inventoryservice.inventory.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository{
	Inventory findByOwner_UserEmail(String ownerUserEmail);
}
