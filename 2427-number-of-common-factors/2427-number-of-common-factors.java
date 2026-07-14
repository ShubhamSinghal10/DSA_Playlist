class Solution {
    public int commonFactors(int a, int b) {
        
        List<Integer> list = new ArrayList<>();

        int mini = Math.min(a,b);
        int maxi = Math.max(a,b);

        for(int i = 1; i <= mini; i++) {
            if(mini % i == 0) list.add(i);
        }

        int count = 0;

        for(int i = 0; i < list.size(); i++) {
            if(maxi % list.get(i) == 0) count++;
        }

        return count;
    }
}