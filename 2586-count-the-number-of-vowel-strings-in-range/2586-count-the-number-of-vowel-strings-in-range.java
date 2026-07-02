class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        int ans = 0;

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        for(int i = left; i <= right; i++) {

            String s = words[i];

            if(list.contains(s.charAt(0)) && list.contains(s.charAt(s.length()-1))) ans++;
        }

        return ans;
    }
}