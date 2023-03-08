package com.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AllThreeMain 
{
public static void main(String[] args) 
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
	Person person = (Person) applicationContext.getBean("myperson");
	
    System.out.println("Person id is="+person.getId());
    System.out.println("Person name is="+person.getName());
    System.out.println("Person Phone Number is="+person.getPhno());
    System.out.println("Mobile id is="+person.getMobile().getId());
    System.out.println("Mobile Brand is="+person.getMobile().getBrand());
    System.out.println("Mobile Cost and Colour is="+person.getMobile().getCostcolor());
    System.out.println("Amazone order id is="+person.getMobile().getAmazone().getOrderid());
    System.out.println("Ordered quantity is="+person.getMobile().getAmazone().getQuantity());
    System.out.println("Cost of mobile is="+person.getMobile().getAmazone().getCost());
    System.out.println("Mobile item is="+person.getMobile().getAmazone().getItem());
		
}
}
