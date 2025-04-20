package org.omegafrog.orderservice.ui;

import java.util.List;

import org.omegafrog.orderservice.domain.OrderLineDto;

public record OrderRequest(String ordererName, String ordererEmail, List<OrderLineDto> orderLines) {

}
