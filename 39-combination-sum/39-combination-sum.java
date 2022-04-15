class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combsum(candidates, target, list, 0, res);
        return res;
    }
    
    public void combsum(int[] candidates, int target,List<Integer> list, int idx, List<List<Integer>> res){
        if( target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        
        for(int i=idx; i<candidates.length; i++){
            if(target >= candidates[i]){
             list.add(candidates[i]);
             combsum(candidates, target-candidates[i], list, i, res);
             list.remove(list.size()-1);   
            }
        }
    }
}