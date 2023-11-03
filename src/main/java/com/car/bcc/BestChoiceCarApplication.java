package com.car.bcc;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.car.bcc.model.Car;
import com.car.bcc.repository.CarRepository;

@SpringBootApplication
public class BestChoiceCarApplication {
	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestChoiceCarApplication.class, args);
	}
	
	@PostConstruct
	public void initalize() {
		Car c1=new Car(1,"Hyundai","I10",2019,10000,300000,"Petrol");
		Car c2=new Car(2,"Hyundai","I20",2018,20000,200000,"Diesel");
		Car c3=new Car(3,"Hyundai","Verna",2019,15000,250000,"Petrol");
		Car c4=new Car(4,"Tata","Bolt",2019,15000,250000,"Petrol");
		Car c5=new Car(5,"Maruthi Suzuki","Ciaz",2019,5000,600000,"Petrol");
		Car c6=new Car(6,"Honda","jazz",2018,20000,200000,"Diesel");
		Car c7=new Car(7,"Honda","City",2019,15000,400000,"Petrol");
		Car c8=new Car(8,"Maruthi Suzuki","Ertiga",2018,10000,550000,"Petrol");
		Car c9=new Car(9,"Tata","Nexon",2019,5000,600000,"Petrol");
		List<Car> listCar=List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9);
		carRepository.saveAll(listCar);
	}

}
