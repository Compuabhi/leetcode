package com.java.leetCode;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_4Sum {
	
		public static void main(String[]args){
			int [] nums = {1, 0, -1, 0, -2, 2};
			int target=0;
			fourSum(nums,target);
		}

	    public static ArrayList<List> fourSum(int[] nums, int target) {
	        //itrate over two loops and reduce it to 2sum problem
	        ArrayList<List> l1=new ArrayList<List>();
	        int n=nums.length,start=0,end=0,remT;
	        if(n<4 && nums==null)
	            return l1;
	        Arrays.sort(nums);    
	        for(int i=0;i<n-4;i++){
	            if(nums[i]==nums[i+1])
	                continue;
	            for(int j=i+1;j<n-3;j++){
	                if(nums[j]==nums[j+1])
	                continue;
	                start=j+1;end=n-1;
	                remT=target-(nums[i]+nums[j]);
	                  
	                while(start<end){
	                    while(start<n-1 && nums[start]==nums[start+1])
	                        start++;
	                    while( end>=1 && nums[end]==nums[end-1])
	                        end--;  
	                    if(nums[start]+nums[end]==remT){
//	                         int []arr = {nums[i],nums[j],nums[start],nums[end]};
	                        l1.add((List) Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
	                    }
	                    else if(nums[start]+nums[end]<remT)  
	                        start++;
	                    else
	                        end--;
	                }
	            }    
	            
	        }    
	        
	        return l1;
	    }
	}
	
