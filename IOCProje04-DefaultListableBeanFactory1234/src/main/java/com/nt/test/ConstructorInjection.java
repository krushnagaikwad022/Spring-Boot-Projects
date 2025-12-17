package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjection {
	
public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs1/applicationContext.xml");

		WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
		//Invoke the Business method.
		String result=generator.generateMessage("raja");
		System.out.println("wish message is :: "+result);
		

}
}