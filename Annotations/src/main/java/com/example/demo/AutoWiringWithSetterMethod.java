package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoWiringWithSetterMethod 
{
	
	private Fruits fruits;
	
	@Autowired
	public void setGrapes(@Qualifier("grapes") Fruits fruits)
	{
		this.fruits=fruits;
	}
	
	@RequestMapping("/fruitColor")
	public String color()
	{
		return fruits.color();
	}
}
interface Fruits
{
	String color();
}
@Service
class Grapes implements Fruits
{
	public String color()
	{
		return "Grapes color is black";
	}
}
@Service
class Oranges implements Fruits
{
	public String color()
	{
		return "Oranges color is orange";
	}
}

