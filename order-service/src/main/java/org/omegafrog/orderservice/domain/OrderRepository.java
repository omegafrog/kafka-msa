package org.omegafrog.orderservice.domain;

import java.util.List;

public interface OrderRepository {
	Order save(Order order);

	List<Order> findAll();

	Order findById(Long id);

	void deleteById(Long id);
}
