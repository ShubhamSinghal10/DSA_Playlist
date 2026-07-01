class Solution {
    public int minimumRounds(int[] tasks) {
        
        int ans = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : tasks) map.put(ele, map.getOrDefault(ele,0)+1);

        int count = 0;
        boolean ya = true;

        for(int k : map.keySet()){

            int v = map.get(k);

            if(v < 2) {
                ya = false;
                break;
            }
            else if(v < 4){
                count++;
            }
            else {
                count += (v+2)/3;
            }
        }

        if(!ya) return -1;
        else return count;
    }
}