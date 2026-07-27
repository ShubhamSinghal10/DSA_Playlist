class Solution {
    public boolean validMountainArray(int[] arr) {

        boolean down = true;

        int n = arr.length;
        int idx = 0;

        for(int i = 0; i < n-1; i++) {

            if(arr[i] >= arr[i+1]) {
                idx = i;
                break;
            }
        }

        if(idx < 1) return false;
        else {

            for(int i = idx; i < n-1; i++) {
                if(arr[i] <= arr[i+1]) return false;
            }
            return true;
        }
    }
}