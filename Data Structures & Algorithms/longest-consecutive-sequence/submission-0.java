class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest =0;

        for(int i:nums){
            if(!set.contains(i-1)){
                int length =0;
                while(set.contains(i+length)){
                    length+=1;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
