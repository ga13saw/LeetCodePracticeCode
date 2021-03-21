package com.code4you.move_zores;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums ={1,0,1,0,0,12,88,65};
		//moveZeroes(nums);
		//moveZeros2(nums);
		moveZeroes3(nums);
	}
	public static void moveZeroes3(int[] nums) {
        int zeroes=0;
        for( int i=0; i<nums.length; i++ ) {
            if( nums[i]==0 ) zeroes++;
            else nums[i-zeroes]=nums[i];
        }
        while( zeroes>0 ) nums[nums.length-zeroes--]=0;
        for (int i : nums) {
			System.out.print(i+" ");
		}
	 System.out.println();
    }
	
	private static void moveZeros2(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				nums[index++] = nums[i];
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		 for (int i : nums) {
				System.out.print(i+" ");
			}
		 System.out.println();
	}
	// 1 0 0 3 4
public static void moveZeroes(int[] nums) {
	int zerocount = 0;
	for (int i : nums) {
		if (i==0) {
			zerocount++;
		}
	}
	for (int j = 0; j < zerocount; j++) {
		
        for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 0 && nums[i+1] !=0) {
				nums[i] = nums[i+1];
				nums[i+1] = 0;
			}
		}}
        for (int i : nums) {
			System.out.print(i+" ");
		}
        System.out.println();
    }

}
