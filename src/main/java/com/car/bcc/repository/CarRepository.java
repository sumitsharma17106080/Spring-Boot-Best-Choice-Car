package com.car.bcc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.car.bcc.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer>{

	public List<Car> findByBrand(String brand);

	public List<Car> findByPriceGreaterThan(int price);

	public List<Car> findByPriceLessThan(int price);

}
