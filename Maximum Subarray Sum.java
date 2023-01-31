import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		n = 0;
		int max = arr[0];

		for(int i=0; i<arr.length; i++){
		// for(int i=0; i<n-1; i++){
			n= n+arr[i];
			if(n>max){
				max = n;
			}
			else{
				max = max;
			}
			if(n < 0 ){
				n = 0;
				max=0;
			}
		
			
		}
		return max;
	}

}
