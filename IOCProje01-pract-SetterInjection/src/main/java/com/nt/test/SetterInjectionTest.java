package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		
		/*internally uses java.io.File class to hold the name and location of given spring cfg file.
		 * It does not actually locate the given file.
		 * it just holds name and location of the file*/
		
		// hold spring bean cfgs file name and location
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		/*1 takes given "res" object(fileSystemResource obj ) to get name and location of spring bean configuration file.
		 *2 loads the spring bean configuration file (applicationContext.xml) and checks weather it is well formed or not valid not .
		 *if not it throws exception.
		 *3 if the spring bean configuration file is well formed and valid then inMemory Metadata of spring bean configuration file will be created in the JVM memory of the RAM 
		 *where the spring application is executing.
		 *4 Creates IOC container /spring bean container of type BeanFactour having the above created inMemory Metadata of spring bean configuration and return XmlBeanFactory object ref (factory) representing IOC container */
		
		//create IOC container (Bean factory container ) = factory means IOC container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		/*1 factory.getBean("wmg") method called on IOC container object (factory) ,makes the IOC container 
		 * to search "wmg" bean id spring bean class configuration in the Inmemory methadata of spring cfg file(applicationContext.xml)files inMemoryMetaData)and finds
		 * com.nt.beans.WishMessageGeneraator having setter injection cfg because of <property>) so it loads clss creates the object using reflection api.
		 * 
		 *  //Loading class
		 *  Class c1=Class.forName("com.nt.beans.WishMessageGenerator");
		 *  //create dynamic object
		 *  Object obj =cons[0].newInstance();
		 *  WishMessageGenerator wmg=(WishMessageGenerator)obj;
		 *  
		 *  2. Goes to <property> tag ref="dt" attribute and searches for the spring bean class configuration whose bean id is 
		 *  is "dt". in the InMemoryMetaData of applicationContext.xml ad finds "java.utiol.Date" class configuration.
		 *  Notices thet no injects area configuraed so loads the class and creates teh object using reflect api.*/
		
		//Get target spring bean class object
		Object obj=factory.getBean("wmg");
		
		//Typecasting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		//invoke business method
		String result=generator.generateMessage("raja");
		System.out.println("wish message is:: "+result);
		
		
	}

}
