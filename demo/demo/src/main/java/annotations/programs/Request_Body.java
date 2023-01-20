package annotations.programs;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Request_Body 
{
	@RequestMapping("/users")
	public void userDetails(@RequestBody User user)
	{
		System.out.println(user);
	}
}
class User
{
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString()
	{
		return "Name:"+firstName+" "+lastName+" "+"Age :"+age+" "+" "+"Gender :"+gender;
	}
	
	
}