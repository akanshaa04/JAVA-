package com;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
	
	Map<String, Integer> getStudents  (Map<Integer, Integer>mp){
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(Integer it:mp.keySet()) {
			
			int val = mp.get(it);
			
			if(val >= 90) {
				if(m.containsKey("Gold")) {
					Integer currcount = m.get("Gold") ;
					m.put("Gold", currcount+1);
				}
				else {
					m.put("Gold", 1);
				}
			}
			else if(val >= 80 && val < 90) {
				if(m.containsKey("Silver")) {
					Integer currcount = m.get("Silver") ;
					m.put("Silver", currcount+1);
				}
				else {
					m.put("Silver", 1);
				}
			}else if(val >= 70 && val < 80) {
				if(m.containsKey("Bronze")) {
					Integer currcount = m.get("Bronze") ;
					m.put("Bronze", currcount+1);
				}
				else {
					m.put("Bronze", 1);
				}
			}
		}
		
		return m;
		
	}

	public static void main(String st[]) {
		
		Map<Integer,Integer>mp = new HashMap<Integer, Integer>();
		
		mp.put(101, 75);
		mp.put(102, 81);
		mp.put(103, 67);
		mp.put(104, 78);
		mp.put(105, 89);
		mp.put(106, 93);
		mp.put(107, 92);
		mp.put(108, 84);
		mp.put(109, 72);
		
		Question4 q = new Question4();
		Map<String , Integer> m = q.getStudents(mp);
		
		for(String it:m.keySet()) {
			System.out.println(it+" : "+ m.get(it));
		}
		
	}
}
