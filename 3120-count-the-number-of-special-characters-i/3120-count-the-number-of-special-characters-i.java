class Solution {
    public int numberOfSpecialChars(String word) {

        int ans = 0;
        
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if(Character.isUpperCase(ch) && (!set.contains(ch))) {
                
                if(set.contains(Character.toLowerCase(ch))) ans++;
            }
            else if(Character.isLowerCase(ch) && (!set.contains(ch))) {
                
                if(set.contains(Character.toUpperCase(ch))) ans++;
            }
            set.add(ch);
        }
        return ans;
    }
}