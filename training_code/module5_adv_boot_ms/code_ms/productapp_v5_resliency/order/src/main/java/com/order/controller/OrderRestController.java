package com.order.controller;

import com.order.dto.*;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
public class OrderRestController {


	@Autowired
	private OrderService orderService;

	@Autowired
	private ConfigDto configDto;

	@GetMapping(path = "info")
	public ConfigDto getConfigDto(){
		return configDto;
	}
	
	@PostMapping(path="orders")
	public ResponseEntity<OrderResponse> submitOrder(@RequestBody
													OrderRequest orderRequest){
		OrderResponse orderResponse=orderService.bookOrder(orderRequest);
		return  ResponseEntity.status(HttpStatus.CREATED).body(orderResponse);
	}

}
