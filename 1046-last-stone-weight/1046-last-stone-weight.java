class Solution {
    public int lastStoneWeight(int[] stones) {
    ArrayList<Integer> ar = new ArrayList<>();
    
    for(int i=0;i<stones.length;i++){
        ar.add(stones[i]);
    }
    
   
   
    while(ar.size()>1){
         
    Collections.sort(ar);
        
        int y = ar.get(ar.size()-1);
        ar.remove(new Integer(y));
        
        int x = ar.get(ar.size()-1);
        ar.remove(new Integer(x));
        
        if(x!=y){
            ar.add(y-x);
        }
       
        
    }
    
    if(ar.isEmpty()){
        return 0;
    }else{
        return ar.get(0);
    }
    }
}