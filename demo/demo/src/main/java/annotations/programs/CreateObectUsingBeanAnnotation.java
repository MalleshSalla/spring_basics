package annotations.programs;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateObectUsingBeanAnnotation
{
	@Bean
	public MyService myService()
	{
		return new MyService();
	}
	
	@GetMapping("/greet")
	public String greeting()
	{
		return myService().greet();
	}
}

class MyService
{
	public String greet()
	{
		return "Welcome user";
	}
}
