package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question2 {

	public Map<Character, Integer> countChars(char[] arr ){
		
		Map<Character, Integer>mp = new HashMap<>();
		
		for(int i = 0 ; i < arr.length; i++) {
			if(mp.containsKey(arr[i])) {
				int currcount = mp.get(arr[i]);
				mp.put(arr[i], currcount+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		
		return mp;
		
	}
	
	public static void main(String st[]) {
		
		char arr[] = {'a','g','a','d','g','a','v','d','v','a','d','g','s'};
		
		Question2 q = new Question2();
		Map<Character, Integer> mp = q.countChars(arr);
		
		Set<Character>s = mp.keySet();
	    System.out.println(s);

		
		for(Object it:s) {
			Integer c = mp.get(it);
		    System.out.println(it + " : " + c);

			
		}
		
		
	}
}
