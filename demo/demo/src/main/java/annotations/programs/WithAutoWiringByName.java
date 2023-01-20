package annotations.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop")
public class WithAutoWiringByName 
{
	@Autowired
	private Laptop dellLaptop; //By name autowiring
	
	@RequestMapping("/details")
	public String detailss()
	{
		return dellLaptop.specifications();
	}
}

interface Laptop
{
	String specifications();
}
@Service
class DellLaptop implements Laptop
{
	public String specifications()
	{
		return "Name:Dell, Color:Black, Ram:8GB, Rom:1TB";
	}
}
@Service
class Lenovo implements Laptop
{
	public String specifications()
	{
		return "Name:Lenovo, Color:White, Ram:8GB, Rom:1TB";
	}
}