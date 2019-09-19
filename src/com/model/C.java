package com.model;

public class C
{
	 public static void main(String[] args) 
	    { 
	        String s1 = new String("HELLO"); 
	        System.out.println(s1.hashCode());
	        String s2 = new String("HELLO"); 
	        System.out.println(s2.hashCode());
	        System.out.println(s1 == s2); 
	        System.out.println(s1.equals(s2)); 
	    } 

}
