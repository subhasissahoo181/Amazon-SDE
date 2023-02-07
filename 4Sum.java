class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null||nums.length == 0){
            return res;
        }

        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            int target_3 =target -nums[i];
            for(int j=i+1; j<n; j++){
                int target_2 = target_3-nums[j];
                int front = j+1;
                int rear =  n-1;

                while(front<rear){
                    int sum_two = nums[front] + nums[rear];
                    if(sum_two < target_2){
                        front++;
                    }
                    else if(sum_two > target_2){
                        rear--;
                    }
                    else{
                        List<Integer> quad = new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[rear]);
                        res.add(quad);

                        while(front<rear && nums[front]==quad.get(2)){
                            front++;
                        }
                        while(front < rear && nums[rear]==quad.get(3)){
                            rear--;
                        }
                    }
                }
                while(j+1<n && nums[j+1] == nums[j]){
                    j++;
                }
                
            }
             while(i+1<n && nums[i+1] == nums[i]){
            i++;}
        }
            
        return res;
       
        
    }
}