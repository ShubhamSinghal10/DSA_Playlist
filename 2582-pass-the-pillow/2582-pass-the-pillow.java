class Solution {
    public int passThePillow(int n, int time) {
        
        if(time < n) return time+1;
        else {
            
            int dir = (int)Math.ceil((double)time/(n-1));
            int mod = time%(n-1);

            if(dir%2 != 0) {
                if(mod == 0) return n;
                else return mod+1;
            }
            else {
                if(mod == 0) return 1;
                else return n-mod;
            }
        }
    }
}