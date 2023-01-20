package com.example.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomQualifierAnnotation
{
	@CarQualifier("skoda")  
	@Autowired
	private  Car3 car3;
	
	@RequestMapping("/drivingCar3")
	public int drive()
	{
		return car3.price();
	}
}
interface Car3
{
	public int price();
}

@Service
class Skoda implements Car3
{
	public int price()
	{
		return 1000000;
	}
}

@Service
class HondaCity implements Car3
{
	public int price()
	{
		return 1100000;
	}
}
@Qualifier
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface CarQualifier
{
	String value();
}
