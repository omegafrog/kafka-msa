package org.omegafrog.inventoryservice.inventory.infra;

import org.omegafrog.inventoryservice.inventory.domain.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaInventoryRepository extends JpaRepository<Inventory, Long> {
	Inventory findByOwner_UserEmail(String ownerUserEmail);
}
