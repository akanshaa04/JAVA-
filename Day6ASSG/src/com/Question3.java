package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question3 {
	
	public Map<Integer,Integer> getSquares(Integer arr[]){
		
		Map<Integer, Integer>mp = new HashMap<>();
		
		for(Integer it:arr) {
			mp.put(it, it*it);
		}
		
		return mp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = {1,2,3,4,5,6,7,8,9};
		
		Question3 q  = new Question3();
		
		Map<Integer, Integer>mp = q.getSquares(arr);
		
		Set<Integer>s = mp.keySet();
		for(Integer it:s) {
			
			System.out.println(it + " : " + mp.get(it));
		}
		
		

	}

}
