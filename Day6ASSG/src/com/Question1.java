package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
	
	public List<String> getValues(Map<String,Integer>mp){
		
		List<String> ls = new ArrayList<>(mp.keySet());
		Collections.sort(ls);
		
		return ls;
		
		
	}
	
	public static void main(String str[]) {
		Map<String, Integer> mp = new HashMap<String,Integer>();
		mp.put("One", 1);
		mp.put("Two", 2);
		mp.put("Three", 3);
		mp.put("Four", 4);
		
		Question1 q1 = new Question1();
		List<String> lsNew = q1.getValues(mp);
		
		for(String it:lsNew) {
			System.out.println(it);
		}
	}

}
