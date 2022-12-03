package com.tutoring.stringbuilder;

import org.w3c.dom.ls.LSOutput;

/**
 * String builder tutoring lab
 * @author alexJenkins
 * @course Java Full Stack Development 
 * @section Core-Java
 * @instructor Ms.Lewis
 * @date 12/03/22
 */
public class StringBuilderBufferLab {
	

	public static void main(String[] args) {
		
		//1.
		/**
		 * Differences
		 * @StringBuffer 
		 * Synchronized: Multiple threads can access the string simultaneously
		 * Thread safe.
		 * Less efficient: Because is it synchronized and thread safe it is slower because it has to lock onto the objects.
		 * @stringBuilder 
		 * Non-synchronized: multiple thread cannot access the methods simultaneously and 
		 * Non thread safe.
		 * More efficient: Because is non thread safe and non synchronized, it can perform operations faster.
		 */
		
		//2
			String greeting = "hello"; //String literal
			StringBuilder sb = new StringBuilder(greeting);
		
		//3
			String s = "hello";
			StringBuilder sBuilder = new StringBuilder(s);
			sBuilder = sBuilder.reverse();
		
		
		//4 
			s = "Establishmentarianism";		
			sBuilder = new StringBuilder(s);
			sBuilder = sBuilder.delete(0, 10);
		
		//5
		/**
		 * @String:The maximum size is 2147483647, the min is 0. Because string are immutable the size is decided at design time when you enter your string
		 * @StringBuilder: The initial capacity is 16 plus the length of the string argument
		 */
		
		//6
			//a. "Java is fun"
			//b. "JavaHTML"
		
		//7
			MyStringBuilder sb1 = new MyStringBuilder("HELLOO");
			MyStringBuilder sb2 = new MyStringBuilder("world");


			
			
			
	}
	
}
