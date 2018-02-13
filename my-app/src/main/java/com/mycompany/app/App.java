package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords==null) ? 0 : separateWords.length;
	}

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
        int count  = app.countWords("I have four words");
        System.out.println("Word Count:  " + count);
    }
}
