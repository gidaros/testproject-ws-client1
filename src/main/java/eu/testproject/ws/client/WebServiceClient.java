package eu.testproject.ws.client;

import eu.testproject.dto.SayHiDTO;
import eu.testproject.ws.HelloWorld;


public class WebServiceClient 
{	
	public static void main(String[] args)
	{
		SpringContext context = SpringContext.getInstance();
		HelloWorld hello = (HelloWorld)context.getBean("helloClient");
		String response = hello.sayHi(new SayHiDTO("geiaaa sou", false));
		System.out.println(response);	
	}
}
