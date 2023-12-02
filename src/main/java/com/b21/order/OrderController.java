package com.b21.order;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OrderController {
	@Autowired
	OrderRepository repo;
	private OrderService service;
	//  Retrieval
	
	
	@GetMapping("/order")
	public List<Order> list()
	{		
	return service.listAll();
	}
	@GetMapping("/order/{id}")
	public ResponseEntity<Order> get(@PathVariable Integer id)
	{
	try
	{
	Order order = service.get(id);
	return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	}
	}
	
	
	
	//Create operation
	@PostMapping("/order")
	public void add(@RequestBody Order order)
	{
	service.save(order);
	}
	
	
	
	//Update 
	@PutMapping("/orders/{id}")
	public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer id)
	{
	try
	{
	Order existOrder = service.get(id);
	service.save(order);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
	
	
	// Delete 
	@DeleteMapping("/order/{id}")
			
	public void delete(@PathVariable Integer id)
	{
	service.delete(id);
	}

}
