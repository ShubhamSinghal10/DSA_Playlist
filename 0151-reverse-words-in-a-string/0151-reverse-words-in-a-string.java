class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.trim().split("\\s+");

        int i = 0;
        int j = str.length-1;

        while(i < j) {
            String s1 = str[i];
            str[i] = str[j];
            str[j] = s1;

            i++;
            j--;
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i1 = 0; i1 < str.length; i1++) {

            String s2 = str[i1];
            
            sb.append(s2);
            if(i1 != str.length-1) sb.append(" ");
            
        }

        return sb.toString();
    }
}