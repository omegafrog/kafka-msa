package org.omegafrog.orderservice.application;

import org.omegafrog.orderservice.domain.OrderDto;
import org.omegafrog.orderservice.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
}
