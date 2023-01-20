package annotations.programs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Request_Mapping 
{
	@RequestMapping("/user1")
	public String getUser()
	{
		return "getUser()";
	}
	@RequestMapping(value= {"/USER2","/user2","User2"})
	public String getSecondUser()
	{
		return "getSecondUser()";
	}
}
