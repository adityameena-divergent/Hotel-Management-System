package com.divergentsl.hms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.divergentsl.hms.config.AppConfig;
import com.divergentsl.hms.hms.HMSMainMenu;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	HMSMainMenu main = context.getBean(HMSMainMenu.class);
    	
    	main.mainMenu();
    	
    }
}
