package annotations.programs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Request_Param
{
	@RequestMapping("/employee")
	public int getEmployeeSalary(@RequestParam int salary)
	{
		return salary;
	}
	
	@RequestMapping("/customer")
	public String getCustomerName(@RequestParam(name="customerName") String name)
	{
		return name;
	}
	
	@RequestMapping("/admin")
	public String getAdmin(@RequestParam(defaultValue="Durga Prasad") String defaultValue)
	{
		return defaultValue;
	}
}
