class Solution {
    public long maxKelements(int[] nums, int k) {
        
        long ans = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(int ele : nums) pq.add(ele);

        while(k > 0) {
            int ele = pq.poll();
            ans += ele;
            pq.add((ele+2)/3);
            k--;
        }

        return ans;
    }
}