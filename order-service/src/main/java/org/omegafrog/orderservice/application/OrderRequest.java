package org.omegafrog.orderservice.application;

import java.util.List;

import org.omegafrog.orderservice.domain.Order;
import org.omegafrog.orderservice.domain.OrderLineDto;

public record OrderRequest(String ordererName, String ordererEmail, List<OrderLineDto> orderLines) {

}
