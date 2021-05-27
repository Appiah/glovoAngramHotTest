package com.glovo.anagramtest;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest {

	public static void main(String[] args) {
		
		//String str_1 = "AABB";
		//String str_2 = "AAB";
		
		String str_1 = "AXABBQDACQY";
		String str_2 = "BYBAAQACDQX";
		
		/*
		Input: ABCD, DABC
		Output: true
		
		
		Input: AABB, BBAA
		Output: true
		
		
		Input: AAAB, AAB
		Output: false
		
		
		Input: AAAB, AABC
		Output: false
		
		
		Input: ACBA, ABBC
		Output: false 
		*/
		
		System.out.println("The anagramness of : str_1 : "+str_1 +" and "
		+", str_2 : "+str_2+" is :  \n"+checkForAnagramness(str_1, str_2));

		//The expected time complexity : O(n);
		
		//Correction : the space complexity value is directly proportional to the time complexity value
		
		
	}
	
	
	public static boolean checkForAnagramness(String str_1, String str_2) {
		
		boolean anagram_bool = false;
		
		int str_1_size = str_1.length();
		int str_2_size = str_2.length();
		
		if( str_1_size != str_2_size) {
			anagram_bool = false;
		}else {
			
			char [] str_1_arr = str_1.toCharArray();
			char [] str_2_arr = str_2.toCharArray();
			
			Map <Character, Integer> str_1_map = str_to_map(str_1_arr);
			Map <Character, Integer> str_2_map = str_to_map(str_2_arr);
			
			System.out.println("str_1_map : "+str_1_map);
			System.out.println("str_2_map : "+str_2_map);
			
			if(str_1_map .equals( str_2_map ) ) {
				anagram_bool = true;
			}
			
			
		}
		
		return anagram_bool;
		
		
	}
	
	public static Map<Character, Integer> str_to_map ( char [] char_arr ) {
		
		int str_1_size = char_arr.length;
		
		Map <Character, Integer> str_to_char_map = new HashMap<Character, Integer>() ;
			
			//int [] str_1_unique_set_counts = new int [str_1_size];
			
			for(int i=0; i < str_1_size; i++) {
				
				//store the characters on a unique condition
				if( str_to_char_map.containsKey(char_arr[i]) ){
					//the unique set contains this character at str_1_arr[i] already
					//DO NOT ADD IT to the unique set
					
					//str_1_unique_set_counts[i]++; 
					
					int current_char_count_i = str_to_char_map.get(char_arr[i]);
					current_char_count_i++;
					
					str_to_char_map.put(char_arr[i], current_char_count_i);
					
				}else {
					
					str_to_char_map.put(char_arr[i], 1);
				
					//str_1_unique_set[i] = str_1_arr[i];
					
				}
				
			}
			
			return str_to_char_map;
		
	}
	

}
