package com.example.demo;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//We can use @Resource annotation instead of @AutoWiring annotation to inject objects.
//We can also use @Inject annotation instead of @Autowiring annotation
@RestController
public class ResourceAndQualifier 
{
	@Qualifier("innova")  
	@Resource
	private  Cars cars;
	
	@RequestMapping("/driving")
	public String drive()
	{
		return cars.color();
	}
}
interface Cars
{
	String color();
}

@Service
class Jaguar implements Cars
{
	public String color()
	{
		return "Jaguar car is driving";
	}
}

@Service
class Innova implements Cars
{
	public String color()
	{
		return "Innova car is driving";
	}
}
