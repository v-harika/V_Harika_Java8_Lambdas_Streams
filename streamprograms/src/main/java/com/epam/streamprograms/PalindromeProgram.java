package com.epam.streamprograms;
import java.util.*;

public class PalindromeProgram {
		
	    public int check(String s)
	    {
	       String b="";
	       int n = s.length();
	       for(int i = n - 1; i >= 0; i--)
	       {

	            b = b + s.charAt(i);
	           
	       }
	       if(s.equalsIgnoreCase(b))
	       {
	          return 1;
	        }
	      else{

	          return 0;
	         }
	    }
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int sum=0;
		    int f=sc.nextInt();
		    List<String> s =new ArrayList<String>();
		    List<String> g =new ArrayList<String>();
		  
		    PalindromeProgram a=new PalindromeProgram();
		    for(int i=0;i<f;i++)
		    {
		    s.add(sc.next());
		    }
		    for(String d:s)
		    {
		        if(a.check(d)==1)
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

