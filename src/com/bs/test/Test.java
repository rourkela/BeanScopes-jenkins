package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Bike;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/bs/common/Applicationcontext.xml"));
   Bike bike1=(Bike) factory.getBean("bike",Bike.class);
   Bike bike2=(Bike) factory.getBean("bike",Bike.class);
   System.out.println("Bike1==Bike2?:"+(bike1==bike2));
  
   
 }

}
