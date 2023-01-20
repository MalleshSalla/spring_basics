package annotations.programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithAutoWiringByType 
{
	@Autowired
	private Bike bike;  //by type autowiring(Splender is bike type)
	
	@RequestMapping("/splender")
	public String drive()
	{
		return bike.drive();
	}
}

interface Bike
{
	String drive();
}
@Service
class Splender implements Bike
{
	public String drive()
	{
		return "Splender bike is moving";
	}
}

