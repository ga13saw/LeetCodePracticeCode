package com.code4you.excelsheet_column_number;

public class Solution {

	public static void main(String[] args) {
		System.out.println('Z'-'A');
		System.out.println(titleToNumber("AB"));
	}
	public static int titleToNumber(String s) {
        int num = 0; int place = 1;
        for(int i=s.length()-1; i>=0; i--){
            num += place * (s.charAt(i) - 'A' + 1);
            place*=26;
        }
        return num;
    }

}
