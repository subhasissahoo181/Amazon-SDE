public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int count=0;
        int xor =0;
        
        for(int i=0; i<A.length; i++){
            xor = xor ^ A[i];
            if(map.get(xor ^ B) != null){
                count += map.get(xor ^ B);
            }
            if(xor == B){
                count++;
            }
            if(map.get(xor) != null){
                map.put(xor, map.get(xor) + 1);
            }
            else map.put(xor, 1);
        }
        return count;
        
    }
}
