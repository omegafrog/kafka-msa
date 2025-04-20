package org.omegafrog.orderservice.infra;

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
}
