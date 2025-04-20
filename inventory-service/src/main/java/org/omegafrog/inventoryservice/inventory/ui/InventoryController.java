package org.omegafrog.inventoryservice.inventory.ui;

import org.omegafrog.inventoryservice.inventory.app.InventoryService;
import org.omegafrog.inventoryservice.inventory.domain.InventoryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

	private InventoryService inventoryService;

	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@GetMapping
	public ResponseEntity<InventoryDto> getInventory(@RequestParam(name = "email")String userEmail){
		InventoryDto inventory = inventoryService.getUserInventory(userEmail);
		return ResponseEntity.ok(inventory);
	}

}
