package com.example.joinnativequery.CustomerProductsdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.joinnativequery.CustomerProductsdemo.dto.OrderRequest;
import com.example.joinnativequery.CustomerProductsdemo.dto.OrderResponse;
import com.example.joinnativequery.CustomerProductsdemo.entity.Customer;
import com.example.joinnativequery.CustomerProductsdemo.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class OrderController {

	private final CustomerRepository customerRepository;

	OrderController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	// Endpoint to place an order.
	@PostMapping("/PlaceOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		log.info("Placing order for customers");
		return customerRepository.save(request.getCustomer());
	}

	// Endpoint to retrieve all orders.
	@GetMapping("/FindAllOrders")
	public List<Customer> findallOrders() {
		log.info("Retrieving all orders");
		return customerRepository.findAll();
	}

	// Endpoint to retrieve join information between customers and products.
	@GetMapping("/GetJoinInformation")
	public ResponseEntity<List<OrderResponse>> getCustomerProducts() {
		log.info("Retrieving join information between customers and products");
		List<Object[]> results = customerRepository.getJoinInformation();
		List<OrderResponse> orderResponses = new ArrayList<>();

		for (Object[] result : results) {
			String customerName = (String) result[0];
			String productName = (String) result[1];

			orderResponses.add(new OrderResponse(customerName, productName));
		}

		log.info("Join information retrieved successfully");
		return new ResponseEntity<>(orderResponses, HttpStatus.OK);
	}
}
