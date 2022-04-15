class Solution {
     List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        comb( n,  k, 1, list);
        return res;
    }
    
    public void comb(int n, int k, int idx, List<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = idx; i<= n; i++){
                list.add(i);
                comb( n,  k, i+1, list);
                list.remove(list.size()-1);
        }
    }
}