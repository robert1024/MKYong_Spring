package com.bigshi.mkyong.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author robert1024
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
        output.generateOutput();
    }
}
