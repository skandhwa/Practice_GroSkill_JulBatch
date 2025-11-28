package Utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJOMapper.CreateUserPOJO;

public class CreateUserData {
	
	
	public static String createUser() throws JsonProcessingException
	{
	
	CreateUserPOJO emp=new CreateUserPOJO();
	emp.setId(1234);
	emp.setName("Harry");
	emp.setSalary(90000f);
	emp.setMarried(false);
	
	ObjectMapper obj=new ObjectMapper();
	
	String empJSON=obj.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
	
	return empJSON;
	
	
	}
	

}
