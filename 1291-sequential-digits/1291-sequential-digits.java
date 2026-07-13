class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> list = new ArrayList<>();

        String s = "123456789";

        int n = s.length();

        for(int i = 0; i < n ; i++) {

            for(int j = i; j < n; j++) {

                String ans = s.substring(i,j+1);

                int a = Integer.parseInt(ans);

                if(low <= a && a <= high) {
                    list.add(a);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}