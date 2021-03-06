/*
  Given an array nums containing n distinct numbers in the range [0, n], 
  return the only number in the range that is missing from the array.
*/
/*
  Input: nums = [3,0,1]
  Output: 2
  Explanation: 
  n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
  2 is the missing number in the range since it does not appear in nums.
  
  Input: nums = [0,1]
  Output: 2
  Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
  2 is the missing number in the range since it does not appear in nums.
  
  Input: nums = [9,6,4,2,3,5,7,0,1]
  Output: 8
  Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
  8 is the missing number in the range since it does not appear in nums.
  
  Input: nums = [0]
  Output: 1
  Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 
  1 is the missing number in the range since it does not appear in nums.
*/



class Solution {
    public int missingNumber(int[] nums) {
		int num = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++){
		   set.add(nums[i]);	
		}
		int count = nums.length + 1;
		for(int i = 0 ; i < count; i++){
		  if(!set.contains(i)) num = i;	
		}
		return num;
	}
}	
	