package annotations.programs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Path_Variable
{
	@RequestMapping("/user/{num}")
	public int print(@PathVariable int num)
	{
		int sum=0;
		while(num>=0)
		{
			num=num%10;
			sum=sum+num;
			num=num/10;
		}
		return sum;
	}
}
