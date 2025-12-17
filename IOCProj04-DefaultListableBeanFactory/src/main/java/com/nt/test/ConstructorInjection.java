package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.nt.beans.WishMessageGenerator;

public class ConstructorInjection {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        // make sure the config file is on the classpath
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

        WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);
        String result = generator.generateMessage("Raja");
        System.out.println("Wish message is :: " + result);
    }
}
