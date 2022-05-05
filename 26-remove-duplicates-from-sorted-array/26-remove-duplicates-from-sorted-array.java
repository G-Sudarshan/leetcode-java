class Solution {
    public int removeDuplicates(int[] arr) {
        int len = 0, n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[len++] = arr[i];
            }
        }
        arr[len++] = arr[n-1];
        return len;
    }
}