class Solution {
    public long[] sumOfThree(long num) {
        
        long n = (long)num/3;
        long pre = n-1;
        long post = n+1;

        if((n+pre+post) == num) return new long[]{pre,n,post};
        else return new long[]{};
    }
}