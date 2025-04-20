package org.omegafrog.inventoryservice.inventory.app;

import org.omegafrog.inventoryservice.inventory.domain.InventoryDto;
import org.omegafrog.inventoryservice.inventory.domain.InventoryRepository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

	private InventoryRepository inventoryRepository;

	public InventoryService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}

	public InventoryDto getUserInventory(String userEmail) {
		return new InventoryDto(inventoryRepository.findByOwner_UserEmail(userEmail));
	}
}
