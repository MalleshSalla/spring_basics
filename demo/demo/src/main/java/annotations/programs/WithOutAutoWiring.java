package annotations.programs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithOutAutoWiring  //controller class
{
	@RequestMapping("/tesla")
	public String print()
	{
		Tesla t=new Tesla();
		String s= t.drive(); //return t.drive;
		return s;		
	}
}

interface Car   //interface
{
	String drive();
}

class Tesla implements Car //implementation class (service class)
{
	public String drive()
	{
		return "Tesla car is moving";
	}
}