package org.omegafrog.orderservice.infra;

import org.omegafrog.orderservice.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderRepository extends JpaRepository<Order, Long> {
}
