package com.code4you.fizz_buzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int n = 15;
		List<String> fizzBuzz = fizzBuzz(n);
		for (String string : fizzBuzz) {
			System.out.print(string+" ");
		}
		System.out.println();
		List<String> fizzBuzz2 = fizzBuzz2(n);
		for (String string : fizzBuzz2) {
			System.out.print(string+" ");
		}
		System.out.println();
		List<String> fizzBuzz3 = fizzBuzz3(n);
		for (String string : fizzBuzz3) {
			System.out.print(string+" ");
		}
	}

	private static List<String> fizzBuzz3(int n) {
		List<String> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Fizz");
		map.put(5, "Bizz");
		
		for (int i = 1; i <= n; i++) {
			String str="";
			for (Integer num : map.keySet()) {
				if (i%num==0) {
					str+=map.get(num);
				}
				
			}
			if (str.equals("")) {
				str+=Integer.toString(i);
			}
			
			list.add(str);
		}
		return list;
		
	}

	private static List<String> fizzBuzz2(int n) {
		List<String> list = new ArrayList<>();
		for (int j = 1; j <= n; j++) {
			boolean divBy3 = (j%3==0);
			boolean divBy5 = (j%5==0);
			String str="";
			if (divBy3 && divBy5) {
				str+="FizzBizz";
			}else if (divBy3) {
				str+="Fizz";
			}else if (divBy5) {
				str+="Bizz";
			}
			else {
				str+=Integer.toString(j);
			}
			list.add(str);
		}
		return list;
		
		
	}

	public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
       for (int i = 1; i <= n; i++) {
    	   
    	   if(i%3==0 && i%5==0) {
   			list.add("FizzBuzz");
   		}
		else if (i%5==0) {
			list.add("Buzz");
		}else if (i%3==0) {
			list.add("Fizz");
		} else  {
			list.add(intToStr(i));
		}
	}
        
        
        
		return list;
    }

	public static String intToStr(int num) {
		String string = Integer.toString(num);

		return string;

	}

}
