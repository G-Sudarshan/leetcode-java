class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int limit = 1;
        
        for(int i=1; i<=n;){
            for(int j=0; j<limit && i<=n; j++){
                arr[i] = arr[i-limit] + 1;
                i++;   
            }
            limit *= 2;
        }
        
        return arr;
    }
}