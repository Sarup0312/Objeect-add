package com.model;

public class B
{
	public static void main(String[] args) {

        String myString1 = new String("Sample1");
        System.out.println(myString1.hashCode());
        String myString2 = new String("Sample1");
        System.out.println(myString2.hashCode());
        if(myString1.equals(myString2))
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println(" Not equal");
        }
        	
    }

}
