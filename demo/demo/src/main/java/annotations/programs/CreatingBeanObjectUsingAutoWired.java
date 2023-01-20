package annotations.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatingBeanObjectUsingAutoWired 
{
	//If we are creating object using @Autowired, @Component is mandatory which tells the ioc,for particular class
	//object will be created  
	@Autowired
	public Wish wish;
	
	@GetMapping("/message")
	public String say()
	{
		return wish.message();
	}
}
@Component
class Wish
{
	public String message()
	{
		return "Good morning";
	}
}

