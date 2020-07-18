package com.epam.streamprograms;

import java.util.*;
public class StringProgram extends App {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int sum=0;
	    int n=sc.nextInt();
	    List<String> s =new ArrayList<String>();
	    List<String> g =new ArrayList<String>();
	    
	    for(int i=0;i<n;i++)
	    {
	    s.add(sc.next());
	    }
	    for(String d:s)
	    {
	        if(d.charAt(0)=='a' && d.length()==3)
	        {
	            g.add(d);
	        }
	        else{
	            continue;
	        }
	        
	    }
	    
	  for(String h:g)
	  {
	      System.out.println(h);
	  }
	}



	}


