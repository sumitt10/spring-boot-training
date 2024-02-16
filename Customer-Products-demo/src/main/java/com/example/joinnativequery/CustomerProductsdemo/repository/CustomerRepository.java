package com.example.joinnativequery.CustomerProductsdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.joinnativequery.CustomerProductsdemo.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	// Custom native SQL query to retrieve join information between customers and products.
	@Query(value = "SELECT c.name AS customerName, p.product_name AS productName " + "FROM customer c "
			+ "JOIN product p ON c.id = p.cust_products", nativeQuery = true)
	List<Object[]> getJoinInformation();

}
