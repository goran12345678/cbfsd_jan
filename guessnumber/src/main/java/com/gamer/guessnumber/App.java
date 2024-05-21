package com.gamer.guessnumber;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gamer.guessnumber.bean.GameEngine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("context.xml");
        
        GameEngine engine = (GameEngine) context.getBean("engine");
        
        GameEngine engine2 = (GameEngine) context.getBean("engine");
        engine2.setTitle("My new title");
        
        System.out.println("Game engine title: " + engine.getTitle());
        
        System.out.println("current score: " + engine.getScoreBoard().getScore());
        
        
    }
}
