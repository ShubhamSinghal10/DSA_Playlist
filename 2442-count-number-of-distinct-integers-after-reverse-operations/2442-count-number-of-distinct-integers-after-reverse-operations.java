class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
      

        for(int ele : nums) {

                set.add(ele);
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toString(ele));
                sb.reverse();
                set.add(Integer.parseInt(sb.toString()));
            
        }

        return set.size();
    }
}