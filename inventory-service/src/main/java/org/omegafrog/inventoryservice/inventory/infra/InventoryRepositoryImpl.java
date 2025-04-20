package org.omegafrog.inventoryservice.inventory.infra;

import org.omegafrog.inventoryservice.inventory.domain.Inventory;
import org.omegafrog.inventoryservice.inventory.domain.InventoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepositoryImpl implements InventoryRepository {

	private JpaInventoryRepository jpaRepository;

	public InventoryRepositoryImpl(JpaInventoryRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	@Override
	public Inventory findByOwner_UserEmail(String ownerUserEmail) {
		return jpaRepository.findByOwner_UserEmail(ownerUserEmail);
	}
}
