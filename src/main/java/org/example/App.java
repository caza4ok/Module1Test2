package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AutoFactory autoFactory = ctx.getBean("autoFactory", AutoFactory.class);
        autoFactory.Run();
        System.out.println( "Кол-во автомобилей " + autoFactory.CountCars() );
        autoFactory.Run();
        System.out.println( "Кол-во автомобилей во втором запуске " + autoFactory.CountCars() );
    }
}
