package com.example.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@Primary annotation is used to inject the specific object when same type of objects are there.
//We can use primary annotation instead of @Qualifier annotation.We should mention @Primary above @Service method
@RestController
public class Primary_Annotation
{
	 
	@Autowired
	private  Car2 car2;
	
	@RequestMapping("/drivingCar2")
	public String drive()
	{
		return car2.color();
	}
}
interface Car2
{
	String color();
}

@Service
class Datson implements Car2
{
	public String color()
	{
		return "Datson car is driving";
	}
}
@Primary
@Service
class Suzuki implements Car2
{
	public String color()
	{
		return "Suzuki car is driving";
	}
}
