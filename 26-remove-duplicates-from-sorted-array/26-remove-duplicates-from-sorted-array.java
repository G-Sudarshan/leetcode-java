class Solution {
    public int removeDuplicates(int[] arr) {
        Set<Integer> s = new LinkedHashSet<Integer>();
        
        for(int x: arr){
            s.add(x);
        }
        
        Iterator<Integer> i= s.iterator();  
        int k =0;
           while(i.hasNext())  
           {  
             arr[k] = i.next();
               k++;
           }  
        return k;
    }
}