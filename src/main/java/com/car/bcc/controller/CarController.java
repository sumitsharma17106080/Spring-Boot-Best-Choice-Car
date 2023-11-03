package com.car.bcc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.car.bcc.model.Car;
import com.car.bcc.repository.CarRepository;

@Controller
public class CarController {
	@Autowired
	private CarRepository carRepository;
	
	
	

	@GetMapping("/all")
	public String searchAll(Model m){
		
		 List<Car> movieList= (List<Car>) carRepository.findAll();
		 m.addAttribute("carList", movieList);
		 m.addAttribute("message", "Database is Empty");
		 if(movieList.isEmpty()) return "error";
		 return "carlist";
		
	}
	@PostMapping("/brand")
	public String selectCarByBrand(@RequestParam String brand,Model m){
		List<Car> carList=carRepository.findByBrand(brand);
		m.addAttribute("carList", carList);
		 return "carList";
		
	}
	@PostMapping("/price")
	public String selectCarByPriace(@RequestParam("price") int price,@RequestParam("x") String x,Model m){
		System.out.println(price);
		System.out.println(x);
		List<Car> carList=null;
		if(x.equals("above")) {
			carList=carRepository.findByPriceGreaterThan(price);
		}
		if(x.equals("below")) {
			carList=carRepository.findByPriceLessThan(price);
		}
		
		if(carList.isEmpty()) {
			m.addAttribute("message", "Price Does Not Match with a Single Car . Increase or Decrease Price");
			return "error";
		}
		else {
		m.addAttribute("carList", carList);
		 return "carList";}
		
	}
	
	@PostMapping("/select")
	public String selectCar(@RequestBody String str,Model m){
		 char ch=str.charAt(16);
		 int id= Character.digit(ch, 10);
		 System.out.println(str);
		 System.out.println(id);
		 Car car=carRepository.findById(id).get();
		 m.addAttribute("message", car.getBrand()+" "+car.getModel()+" car");
		
		 return "message";
		
	}
	

}
