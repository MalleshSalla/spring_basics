package annotations.programs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller        //@RestController ->If we use restcontroller then no need to mention @Responsebody in method signature      
public class Response_Body
{
	@RequestMapping("/responsebody")
	public @ResponseBody Users getUsers()  //public Users getUsers()
	{
		Users users =new Users();
		users.setFirstName("Durga");
		users.setLastName("Prasad");
		users.setAge(23);
		users.setGender('M');
		return users;
	}
}
class Users
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
	
	
	
}
