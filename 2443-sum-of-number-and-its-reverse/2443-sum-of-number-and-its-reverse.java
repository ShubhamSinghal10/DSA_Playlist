class Solution {
    public boolean sumOfNumberAndReverse(int num) {

        boolean ya = false;
        
        for(int i = 0; i <= num+1/2; i++) {

            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(i));
            sb.reverse();
            int ele = Integer.parseInt(sb.toString());

            if((ele+i) == num) {
                ya = true;
                break;
            }
        }
        if(ya) return true;
        else return false;
    }
}