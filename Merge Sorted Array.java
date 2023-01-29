import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        for(int i=m,j=0;i<m+n;i++,j++){
            arr1[i]=arr2[j];
        }
        Arrays.sort(arr1);
        return(arr1);
    }
    
}
