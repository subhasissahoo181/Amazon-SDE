class Solution {
    public int longestConsecutive(int[] nums) {
        Set < Integer > hashSet = new HashSet < Integer > ();
        for (int num: nums) {
            hashSet.add(num);
        }
        int longestStack=0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int currentNumber =num;
                int currentStreak =1;
                while(hashSet.contains(currentNumber+1)){
                // while (hashSet.contains(currentNumber + 1))
                    currentNumber+=1;
                    currentStreak+=1;
                }
                longestStack = Math.max(longestStack, currentStreak);
            }
            
        }
        return longestStack;
        
    }
}
