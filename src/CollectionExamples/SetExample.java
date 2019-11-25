package CollectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String args[]) {
		//example
		Set<String> set = new HashSet<String>(); 
		set.add("item1");
		set.add("item2");
		set.add("item3");
		for(String s : set )
		System.out.println(s);
		Iterator<String> iterator = set.iterator();
		if(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
