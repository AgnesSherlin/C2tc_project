package com.b21.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository repo;
		public List<Order> listAll()
		{
		return repo.findAll();
		}
		public void save(Order order)
		{
		repo.save(order);
		}
		public Order get(Integer id)
		{
		return repo.findById(id).get();
		}
		public void delete(Integer id)
		{
		repo.deleteById(id);
		}
	}


	

