package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {
	
	List<Integer> votersList( Map<Integer, Integer>mp){
		List<Integer>ls = new ArrayList<Integer>();
		
		for(Integer it: mp.keySet()) {
			if(mp.get(it) >= 18) {
				ls.add(it);
			}
		}
		
		return ls;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer>mp = new HashMap<Integer, Integer>();
		mp.put(101, 16);
		mp.put(102, 19);
		mp.put(103, 32);
		mp.put(104, 23);
		mp.put(105, 52);
		mp.put(106, 17);
		mp.put(107, 61);
		mp.put(108, 34);
		
		Question6 q = new Question6();
		List<Integer>ls = q.votersList(mp);
		System.out.println(ls);

//		for(Integer it:ls) {
//			System.out.println(it);
//			
//		}
		
	}

}
