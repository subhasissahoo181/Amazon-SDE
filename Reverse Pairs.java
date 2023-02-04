class Solution {
    public int reversePairs(int[] nums) {
        int Pairs =0;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] > 2*nums[j]){
                    Pairs++;
                }
            }
        }
        return Pairs;
    }
}
//-------------------------------------------------------------------------
class Solution {
    public int reversePairs(int[] nums) {
        return mergSort(nums, 0, nums.length-1);
        
    }
    static int merg(int[] nums, int low, int mid, int high){
        int count =0;
        int j=mid +1;
        for(int i=low; i<=mid;i++){
            while(j<=high && nums[i]> (2*(long)nums[j])){
                j++;
            }
            count = count+(j-(mid+1));
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left =low, right = mid+1;
        while(left<= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }
        }
        while(left<=mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        for(int i=low; i<=high; i++){
            nums[i] = temp.get(i-low);
        }
        return count;
    }
    static int mergSort(int[] nums, int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = (low +high)/2;
        int inverse = mergSort(nums,low,mid);
        inverse = inverse + mergSort(nums,mid+1,high);
        inverse = inverse + merg(nums,low,mid,high);
        return inverse;
    }
}


