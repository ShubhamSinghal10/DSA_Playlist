class Solution {
    public String removeStars(String s) {
        
        // Stack<Character> st = new Stack<>();

        // for(int i = 0; i < s.length(); i++) {

        //     if(s.charAt(i) == '*' && !st.isEmpty()) st.pop();
        //     else st.push(s.charAt(i));
        // }

        // StringBuilder sb = new StringBuilder();

        // while(!st.isEmpty()) sb.append(st.pop());

        // sb.reverse();

        // return sb.toString();

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {

            if(ch != '*') sb.append(ch);
            else sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}