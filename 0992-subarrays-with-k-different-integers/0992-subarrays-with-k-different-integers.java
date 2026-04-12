class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return noOfInt(nums,k)-noOfInt(nums,k-1);
    }

    public int noOfInt(int[] nums,int k){
        int cn=0;
        int c=0;
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            c+=(right-left+1);
            right++;

        }
        return c;
    }
}