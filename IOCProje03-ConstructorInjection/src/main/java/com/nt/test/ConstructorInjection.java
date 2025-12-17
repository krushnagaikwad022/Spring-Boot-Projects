package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjection {
	
public static void main(String[] args) {
		
		//Hold spring bean configuration file name and location.
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//Create IOC container (bean factory container)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		//Get spring bean class object.
		Object obj=factory.getBean("wmg");
		
		//Typecasting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		//Invoke the Business method.
		String result=generator.generateMessage("raja");
		System.out.println("wish message is :: "+result);
		

}
}