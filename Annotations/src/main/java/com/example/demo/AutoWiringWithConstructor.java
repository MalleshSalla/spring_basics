package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoWiringWithConstructor
{
	private final Fruit fruit;
	
	@Autowired
	public AutoWiringWithConstructor(@Qualifier("apple") Fruit fruit)
	{
		this.fruit=fruit;
	}
	
	@RequestMapping("/fruit")
	public String color()
	{
		return fruit.color();
	}
}
interface Fruit
{
	String color();
}
@Service
class Apple implements Fruit
{
	public String color()
	{
		return "Apple color is red";
	}
}
@Service
class Banana implements Fruit
{
	public String color()
	{
		return "Banana color is yellow";
	}
}
