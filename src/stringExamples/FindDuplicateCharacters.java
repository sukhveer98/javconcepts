package stringExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findCharacters("SDETDWSE"));
       
	}

	public static String findCharacters(String s) {
		StringBuilder builder = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i),1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			builder.append(entry.getKey());
			//builder.append(" ");
		    builder.append(entry.getValue());
		    builder.append(" ");
		    System.out.println("Character is: "+ entry.getKey()+ " and its occurrence is: "+entry.getValue());
		}
		return builder.toString();
		
		
	}
}
