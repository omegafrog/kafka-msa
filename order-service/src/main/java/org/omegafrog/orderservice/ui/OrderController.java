package org.omegafrog.orderservice.ui;

import java.util.List;

import org.omegafrog.orderservice.domain.OrderDto;
import org.omegafrog.orderservice.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping
	public ResponseEntity<OrderDto> createOrder(@RequestBody OrderRequest orderRequest){
		OrderDto order = orderService.createOrder(orderRequest);
		return ResponseEntity.ok()
			.contentType(MediaType.APPLICATION_JSON)
			.body(order);
	}
	@GetMapping
	public ResponseEntity<List<OrderDto>> getOrders(){
		List<OrderDto> orders = orderService.getOrders();
		return ResponseEntity.ok(orders);
	}
	@GetMapping("/{id}")
	public ResponseEntity<OrderDto> getOrder(@PathVariable(name = "id") Long id){
		OrderDto order = orderService.getOrder(id);
		return ResponseEntity.ok(order);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteOrder(@PathVariable(name="id") Long id){
		orderService.deleteOrder(id);
		return ResponseEntity.ok().build();
	}
}
