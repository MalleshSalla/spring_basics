package annotations.programs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Qualifier_Annotation
{	
	@Qualifier("nokia") 
	@Autowired
	private Mobile mobile;
	
	@RequestMapping("/phone")
	public String use()
	{
		return mobile.use();
	}
}

interface Mobile
{
	String use();
}
@Service
class Samsung implements Mobile
{
	public String use()
	{
		return "Samsung mobile is using...!";
	}
}
@Service
class Nokia implements Mobile
{
	public String use()
	{
		return "Nokia mobile is using...!";
	}
}