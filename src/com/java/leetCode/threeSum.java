package com.java.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 1, 2, -1, -4 };
		int []arr2={};
		ArrayList<ArrayList<Integer>> l1=null;
		l1=fun2(arr);

		for(Object obj:l1.toArray()){
			
			Object[]arr3=((ArrayList)obj).toArray();
		for(Object x:arr3)
			System.out.print(x+" " );
		System.out.println();
		}
	}
	
	
	static ArrayList<ArrayList<Integer>> fun2(int[]num){
		
		ArrayList<ArrayList<Integer>> soln=new ArrayList<ArrayList<Integer>>();
		if(num.length<2)
			return soln;
		int start,end,sum;
		Arrays.sort(num);
		
		for(int i=0;i<num.length-2;i++){
			
			start=i+1;
			end=num.length-1;
			while(start<end){
				sum=num[i]+num[start]+num[end];
				
				if(sum==0)
				{
					ArrayList<Integer>l1=new ArrayList<Integer>();
					l1.add(num[i]);
					l1.add(num[start]);
					l1.add(num[end]);
					soln.add(l1);
					start++;end--;
					while(start<end && num[start]==num[start-1] && num[end]==num[end+1])
					{
						start++;
						end--;
					}
					
					
				}
				else if(sum<0)
					start++;
				
				else
					end--;
				while(i<num.length && num[i]==num[i+1])
					i++;
					
				
			}
			
			
			
		}
		return soln;
		
		
		
	}
	
	
	
	
	
	
	
	static ArrayList<ArrayList<Integer>> fun1(int[] num)   
	{
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();    
	    
	    if(num.length<2)
	    	return result;
	    
	    Arrays.sort(num);
	    for (int i=0; i < num.length; i++) {
	        int start = i + 1, end = num.length-1;
	        while (start < end) {//Two pointers
	            int sum = num[i] + num[start] + num[end];   

	            if (sum == 0) {     
	                ArrayList<Integer> list = new ArrayList<Integer>();
	                list.add(num[i]);
	                list.add(num[start]);
	                list.add(num[end]);    
	                result.add(list);

	                start++;
	                end--;
	                while((start < end) && num[start] == num[start-1]) start++;     //remove duplicates
	                while((start < end) && num[end] == num[end+1]) end--;
	            }
	            else if (sum < 0) {
	                start++;       
	                while((start < end) && num[start] == num[start-1]) start++;     //remove duplicates
	            } else {            
	                end--;
	                while((start < end) && num[end] == num[end+1]) end--;           //remove duplicates             
	            }      
	        }

	        while (i+1 < num.length && num[i+1] == num[i])                          //remove duplicates
	            i++;            
	    }

	    return result;
	}

	static ArrayList<ArrayList<Integer>> fun(int[] nums) {
		
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		int[] arr1 = null;
		arr1 = Arrays.copyOf(nums, nums.length);
		Arrays.sort(arr1);
		for (int x = 0; x < arr1.length; x++) {
			if(arr1[x]>0)
				break;
			for (int y = x+1; y < arr1.length; y++) {
				if(arr1[x]+arr1[y]>0)
					break;
				for (int z = y+1; z < arr1.length; z++) {
					
					if(arr1[x]+arr1[y]+arr1[z]>0)
						break;
					
					if(arr1[x]+arr1[y]+arr1[z]==0)
					{
					ArrayList<Integer> l2=new ArrayList<Integer>();
					l2.add(arr1[x]);
					l2.add(arr1[y]);
					l2.add(arr1[z]);
					result.add(l2);
					}
					
				}
			}
		}
		return result;

}
}
