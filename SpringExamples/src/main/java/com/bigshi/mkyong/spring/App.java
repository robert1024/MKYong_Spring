package com.bigshi.mkyong.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigshi.mkyong.spring.common.Customer;
import com.bigshi.mkyong.spring.common.HelloWorld;
import com.bigshi.mkyong.spring.customer.services.CustomerService;
import com.bigshi.mkyong.spring.output.OutputHelper;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void generateOutputTest(){
      ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloBean");
      obj.printHello();
      
      OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
      output.generateOutput();
	}
	
	/**
	 * Spring inner bean test
	 */
	public static void innerBeanTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
		Customer cus = (Customer)context.getBean("CustomerBean");
		Customer cus1 = (Customer)context.getBean("CustomerBeanC");
		System.out.println(cus);
		System.out.println(cus1);
	}
	
	public static void beanScopeTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
		CustomerService custA = (CustomerService)context.getBean("customerService");
		//CustomerService custA = (CustomerService)context.getBean("customerServicePrototype");
		custA.setMessage("Message by custA");
		System.out.println("Message: "+ custA.getMessage());
		CustomerService custB = (CustomerService)context.getBean("customerService");
		//CustomerService custB = (CustomerService)context.getBean("customerServicePrototype");
		System.out.println("Message: "+ custB.getMessage());
	}
	
	public static void springCollectionsTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		com.bigshi.mkyong.spring.common.collections.Customer cust = (com.bigshi.mkyong.spring.common.collections.Customer)context.getBean("CustomerBean");
		System.out.println(cust);
	}
	
	public static void listFacotryBeanTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-ListFactoryBean.xml");
		com.bigshi.mkyong.spring.common.listfactorybean.Customer cust = (com.bigshi.mkyong.spring.common.listfactorybean.Customer) context.getBean("CustomerBean");
		System.out.println(cust);
	}
    public static void main( String[] args )
    {

    	//generateOutputTest();	
    	
    	/**	inner bean test.	*/
    	//innerBeanTest();
    	
    	/** bean scope tes*/
    	//beanScopeTest();
    	
    	/** Spring Collections Test */
    	//springCollectionsTest();
    	
    	/** List Factory Bean Test */
    	listFacotryBeanTest();
    }
}
