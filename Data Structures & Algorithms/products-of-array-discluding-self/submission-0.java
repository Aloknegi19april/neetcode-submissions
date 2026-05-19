class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] res = new int[nums.length];
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];
        // 1 2 4 6
        // 1 1 2 8
        // 48 24 6 1
        prefixProd[0] = 1;
        for(int i = 1; i < nums.length; i++){
            prod = prod * nums[i-1];
            prefixProd[i] = prod;
        }
        prod = 1;
        suffixProd[suffixProd.length - 1] = 1;
        for(int i = suffixProd.length - 2; i >= 0; i--){
            prod = prod * nums[i+1];
            suffixProd[i] = prod;
        }
        for(int i = 0; i < nums.length; i++){
            res[i] = prefixProd[i] * suffixProd[i];
        }
        return res;
    }
}  
