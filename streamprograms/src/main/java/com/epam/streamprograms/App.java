package com.epam.streamprograms;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
	    int sum=0;
	    int n=sc.nextInt();
	    List<Integer> s =new ArrayList<Integer>();
	    for(int i=0;i<n;i++)
	    {
	    s.add(sc.nextInt());
	    }
	    for(Integer d:s)
	    {
	        sum=sum+d;
	    }
	    
	System.out.println(sum/n);
	}
}

