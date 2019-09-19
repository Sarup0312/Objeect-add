package com.model;

public class A
{
    public static void main(String[] args) {

        String s1 = new String("Abc");
        
        System.out.println(s1.hashCode());
        String s2 = new String("xyz");
        System.out.println(s2.hashCode());
        String s3 = new String("Abc");
        System.out.println(s3.hashCode());
        if(s1.hashCode()==s2.hashCode())
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println(" Not equal");
        }
       
        
        
    }

}
/*
-765470809
-765470808
-765470809
*/