class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        genrateSubsets(nums, 0, list);
        return res;
    }
    
    public void genrateSubsets(int[] nums, int idx, List<Integer> list){
        if(nums.length == idx){
            if(!res.contains(list))
                res.add(new ArrayList<Integer>(list));
            return;
        }
        
        
        genrateSubsets(nums, idx+1, list);
        list.add(nums[idx]);
        genrateSubsets(nums, idx+1, list);
        list.remove(list.size()-1);
        
    }
}