package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");

		for(String greeting : greetings){
			System.out.println("Greeting: " + greeting);
		}
	}
	


	public App(){
		System.out.println("Inside Applications");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.greet();
    }
}
