package asgn03;

public class Arrays {

	//returns sum of numbers in array
	public static int sum(int[] nums) {
	int sum =0;
	
	//if array is empty throws exception
	if(nums.length==0) {
		throw new EmptyArrayNoNumbers();
	}
	
	//if not empty will loop through array adding
	else {
		for(int c =0; c<nums.length; c++) {
			
				sum+=nums[c];
			
		}
	}
	return sum;
	}
	
	//returns max value in array
	public static int max(int[] nums) {
		int max=0;
		//if array is empty throws exception
		if(nums.length==0) {
			throw new EmptyArrayNoNumbers();
		}
		
		//if not empty will loop through array finding max
		else {
			max=nums[0];
			for(int c =0; c<nums.length; c++) {
				if(nums[c]>max) {
				max=nums[c];
				}
					
				
			}
		}
		return max;
	}
	
	//returns min value in array
	public static int min(int[] nums) {
		int min=0;
		//if array is empty throws exception
		if(nums.length==0) {
			throw new EmptyArrayNoNumbers();
		}
		
		//if not empty will loop through array finding max
		else {
			min=nums[0];
			for(int c =0; c<nums.length; c++) {
				if(nums[c]<min) {
				min=nums[c];
				}
					
				
			}
		}
		return min;
	}
	
	//returns range of nums in array
	public static int range(int[] nums) {
		if(nums.length==0) {
			throw new EmptyArrayNoNumbers();
		}
		return ((max(nums)-min(nums))+1);
	}

}
