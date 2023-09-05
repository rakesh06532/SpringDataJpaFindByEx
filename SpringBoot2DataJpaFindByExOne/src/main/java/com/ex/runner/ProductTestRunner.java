package com.ex.runner;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.model.Product;
import com.ex.repo.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		repo.save(new Product(18,"Bags_1",20,300.8,new Date(System.currentTimeMillis()),true));
		repo.save(new Product(19,"Bags_2",20,300.8,new Date(System.currentTimeMillis()),true));
		repo.save(new Product(20,"Bags_3",20,300.8,new Date(System.currentTimeMillis()),true));
		*/
		
//		repo.findByProductName("Book").forEach(System.out::println);
//		repo.findByProductCostGreaterThan(34.8000000).forEach(System.out::println);
//		repo.findByProductCostLessThan(34.800000).forEach(System.out::println);
//		repo.findByProductCostLessThanEqual(34.800000).forEach(System.out::println);
//		repo.findByProductCostIsNotNull().forEach(System.out::println);
//		repo.findByProductCostIsNull().forEach(System.out::println);
//		repo.findByProductCodeLike(12).forEach(System.out::println);
//		repo.findByProductNameStartingWith("B").forEach(System.out::println);
//		repo.findByProductNameContaining("O").forEach(System.out::println);
//		repo.findByProductCodeGreaterThanOrderByProductName(13).forEach(System.out::println);
//		repo.findByProductCodeGreaterThanOrderByProductNameDesc(13).forEach(System.out::println);
//		repo.findByProductCodeNot(12).forEach(System.out::println);
//		repo.findByProductCodeBetween(12, 15).forEach(System.out::println);
//		repo.findByProductCodeOrProductName(10,"Pencil").forEach(System.out::println);
//		repo.findByProductCodeNotOrProductNameLikeOrderByProductCostDesc(10, "%Pen%").forEach(System.out::println);
//		repo.findByProductCodeIn(Arrays.asList(10,11,12,45)).forEach(System.out::println);
//		repo.findByStatusTrue().forEach(System.out::println);
//		repo.findByStatusFalse().forEach(System.out::println);
//		repo.findByMfgDateBefore(new Date(System.currentTimeMillis())).forEach(System.out::println);
		repo.findByMfgDateAfter(new Date(System.currentTimeMillis())).forEach(System.out::println);
	}

}