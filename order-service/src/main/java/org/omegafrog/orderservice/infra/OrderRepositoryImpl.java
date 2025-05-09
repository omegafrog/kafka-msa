package org.omegafrog.orderservice.infra;

import java.util.List;

import org.omegafrog.orderservice.domain.Order;
import org.omegafrog.orderservice.domain.OrderRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderRepositoryImpl implements OrderRepository {

	private JpaOrderRepository jpaRepository;

	public OrderRepositoryImpl(JpaOrderRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	@Override
	public Order save(Order order) {
		return jpaRepository.save(order);
	}

	@Override
	public List<Order> findAll() {
		return jpaRepository.findAll();
	}

	@Override
	public Order findById(Long id) {
		return jpaRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Order not found"));
	}

	@Override
	public void deleteById(Long id) {
		jpaRepository.deleteById(id);
	}
}
