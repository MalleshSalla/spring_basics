package annotations.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Component1 
{
	@Autowired
	MyClass myClass;
	
	@GetMapping("/details")
	public String details()
	{
		return myClass.getDetails();
	}
}

@Component//We can use @Service,@Repository,@Controller instead of @Component
class MyClass
{
	public String getDetails()
	{
		return "Hello this is myclass";
	}
}
