package org.omegafrog.orderservice.service;

import java.util.List;

import org.omegafrog.orderservice.application.OrderRequest;
import org.omegafrog.orderservice.domain.Order;
import org.omegafrog.orderservice.domain.OrderDto;
import org.omegafrog.orderservice.domain.OrderLine;
import org.omegafrog.orderservice.domain.OrderRepository;
import org.omegafrog.orderservice.domain.Orderer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {
	private OrderRepository orderRepository;

	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public OrderDto createOrder(OrderRequest orderRequest) {

		return new OrderDto(orderRepository.save(new Order(new Orderer(
			orderRequest.ordererName(),
			orderRequest.ordererEmail()
		), orderRequest.orderLines().stream().map(
			orderLineDto -> new OrderLine(orderLineDto.getProductName(), orderLineDto.getQuantity(),
				orderLineDto.getAmounts()
			)).toList())));
	}

	public List<OrderDto> getOrders() {
		return orderRepository.findAll().stream().map(OrderDto::new).toList();
	}

	public OrderDto getOrder(Long id) {
		return new OrderDto(orderRepository.findById(id));
	}

	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
	}
}
