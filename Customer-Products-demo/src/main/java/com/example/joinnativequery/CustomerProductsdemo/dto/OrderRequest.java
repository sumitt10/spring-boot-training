package com.example.joinnativequery.CustomerProductsdemo.dto;

import com.example.joinnativequery.CustomerProductsdemo.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
	// Customer information associated with the order request.
	private Customer customer;

}
