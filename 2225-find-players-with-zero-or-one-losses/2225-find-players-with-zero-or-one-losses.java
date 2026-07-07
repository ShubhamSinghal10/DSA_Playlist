class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> ans = new ArrayList<>();
        
        HashSet<Integer> ans11 = new HashSet<>();
        List<Integer> ans2 = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int[] arr : matches) {

            int ele = arr[1];
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(int key : map.keySet()) {

            if(map.get(key) == 1) ans2.add(key);
        }

        for(int[] arr : matches) {
            
            int ele = arr[0];
            if(!map.containsKey(ele)) ans11.add(ele);
        }

        List<Integer> ans1 = new ArrayList<>(ans11);

        Collections.sort(ans1);
        Collections.sort(ans2);

        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}