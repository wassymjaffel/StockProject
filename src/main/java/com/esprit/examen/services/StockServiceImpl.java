package com.esprit.examen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Stock;
import com.esprit.examen.repositories.StockRepository;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public void save(Stock s) {
		// TODO Auto-generated method stub
		stockRepository.save(s);
	}

	/*toDo 9*/








}