package com.ex.repo;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//select * from product where product_name=?
	List<Product> findByProductName(String productName);
	
	//select * from product where product_cost>?
	List<Product> findByProductCostGreaterThan(Double productCost);
	
	//select * from product where product_cost<?
	List<Product> findByProductCostLessThan(Double productCost);
	
	//select * from product where product_cost<=?
	List<Product> findByProductCostLessThanEqual(Double productCost);
	
	//select * from product where product_cost is not null
	List<Product> findByProductCostIsNotNull();
	
	//select * from product where product_cost is null
	List<Product> findByProductCostIsNull();
	
	//select * from product where product_code like ?
	List<Product> findByProductCodeLike(Integer productCode);
	
	//select * from product where product_name like <input>%
	List<Product> findByProductNameStartingWith(String productName);
	
	//select * from product where product_name like %<input>%
	List<Product> findByProductNameContaining(String productName);
	
	//select * from product where product_code >? order by product_name asc
	List<Product> findByProductCodeGreaterThanOrderByProductName(Integer productCode);
	
	//select * from product where product_code >? order by product_name desc
	List<Product> findByProductCodeGreaterThanOrderByProductNameDesc(Integer productCode);
	
	//select * from product where product_code !=?
	List<Product> findByProductCodeNot(Integer productCode);
	
	//select * from product where product_code between ? and ?
	List<Product> findByProductCodeBetween(Integer productCode1, Integer productCode2);
	
	//select * from product where product_code=? or product_name=?
	List<Product> findByProductCodeOrProductName(Integer productCode, String productName);
	
	//select * from product where product_code!=? or product_name like ? order by product_name desc
	List<Product> findByProductCodeNotOrProductNameLikeOrderByProductCostDesc(Integer productCode, String productName);
	
	//select * from product where product_code in (?, ?, ?, ?....)
	List<Product> findByProductCodeIn(Collection<Integer> values);
	
	//select * from product where status=true
	List<Product> findByStatusTrue();
	
	//select * from product where status=false
	List<Product> findByStatusFalse();
	
	//select * from product where mfg_date<?
	List<Product> findByMfgDateBefore(Date date);
	
	//select * from product where mfg_date>?
	List<Product> findByMfgDateAfter(Date date);

}
