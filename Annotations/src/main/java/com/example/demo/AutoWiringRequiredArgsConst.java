package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AutoWiringRequiredArgsConst 
{
	@Autowired
	private  Car audi;
	
	@RequestMapping("/cars")
	public String drive()
	{
		return audi.drive();
	}
}
interface Car
{
	String drive();
}

@Service
class Audi implements Car
{
	public String drive()
	{
		return "Audi car is driving";
	}
}

@Service
class Tesla implements Car
{
	public String drive()
	{
		return "Tesla car is driving";
	}
}