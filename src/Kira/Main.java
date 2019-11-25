package Kira;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
	
	String s1 = "testing is Quality";
	String s2 = "QUALITY is Testing";
	
	String ss = "kjdbw 8438@#$@$ , ./;'ff fredc";
	ss = ss.replaceAll("[^a-zA-Z0-9\\s]", "");
			
	System.out.println(ss);
	
	List<String> list1 = Arrays.asList(s1.split(" ")); 
	List<String> list2 = Arrays.asList(s2.split(" ")); 
	list1.replaceAll(String::toLowerCase);
	list2.replaceAll(String::toLowerCase);
	int size1 = list1.size();
	int size2 = list2.size();

	if(list1.size() >= list2.size())
		{
		   for(String s : list1)
		   {
			 if(!list2.contains(s))
		    	{
			    	System.out.println(s);
			    }
       		}
	    }
	else
	{
		 for(String s : list2)
		   {
			 if(!list1.contains(s))
		    	{
			    	System.out.println(s);
			    }
     		}
	}
	}
	
	
}