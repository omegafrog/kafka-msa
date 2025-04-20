package org.omegafrog.orderservice.ui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${server.port}")
	private String port;
	@GetMapping("/healthCheck")
	public String hi(){
		return port;
	}
}
