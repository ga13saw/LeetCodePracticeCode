package com.code4you.sumof2integers;

public class SumOfTwoNum {

	public static void main(String[] args) {
		int a= 1, b=8;
		
		int sum = getSum(a,b);
		System.out.println(sum);
		
		System.out.println(getSum2(a,b));
		/*System.out.println(5^7);
		System.out.println((a & b) << 1);
		System.out.println(5&7);*/
		

	}
	//use normal if else statement
	private static int getSum2(int a, int b) {
		if (a==0 ) {
			return b;
		}
		if (b==0) {
			return a;
		}
		
		if (a>0 && b>0) {
			if (a>b) {  //1
				while (b>0) {
					a++;
					b--;
				}
				return a;
			}
			else{
				while (a>0) {
					b++;
					a--;
				}
				return b;
			}
		}
		else if (a>0 && b<0 ) { 
			while (b<0) {
				a--;
				b++;
			}
			return a;
		}else if(a<0 && b>0 ){
			while (a<0) {
				b--;
				a++;
			}
			return b;
		}else{//-8 -12
			if (a<b) {
				while (b<0) {
					a--;
					b++;
				}
				return a;
			}else{
				while (a<0) {
					b--;
					a++;
				}
				return b;
			}
		}
		
	}

	//4 1 a>b
	// 1 4   
	// 2 -5  a> b
	//-2 5
	// -2 -5 a>b
	//-5 -2
	private static int getSum(int a, int b) {
		//working on bit level
		return b==0?a:getSum(a^b,(a&b)<<1);
		
	}
	

}
