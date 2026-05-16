class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer diff = target - nums[i];
            if(map.containsKey(diff)){
                indexes[0] = map.get(diff);
                indexes[1] = i;
                break;
            } else{
                map.put(nums[i], i);
            }
        }
        return indexes;
    }
}
