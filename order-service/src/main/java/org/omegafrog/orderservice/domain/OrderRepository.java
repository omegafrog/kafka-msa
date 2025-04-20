package org.omegafrog.orderservice.domain;

import java.util.Arrays;
import java.util.List;

public interface OrderRepository {
	Order save(Order order);

	List<Order> findAll();
}
