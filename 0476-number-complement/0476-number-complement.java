class Solution {
    public int findComplement(int num) {
        
        String str = Integer.toBinaryString(num);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if(c == '0') sb.append(1);
            else sb.append(0);
        }

        String s = sb.toString();

        return Integer.parseInt(s, 2);
    }
}