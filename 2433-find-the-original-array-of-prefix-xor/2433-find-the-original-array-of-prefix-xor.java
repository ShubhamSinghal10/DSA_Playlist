class Solution {
    public int[] findArray(int[] pref) {
        
        int[] pre = new int[pref.length];
        pre[0] = pref[0];

        for(int i = 1; i < pref.length; i++) {
            pre[i] = pref[i] ^ pref[i-1];
        }

        return pre;
    }
}