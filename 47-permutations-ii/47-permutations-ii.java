class Solution {
     public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> r = new ArrayList<>();
        process(nums, r, new boolean[nums.length], new ArrayList<>());
        return r;
    }

    public void process(int[] nums, List<List<Integer>> r, boolean[] visited, List<Integer> current){
        if(current.size() == nums.length){
            r.add(new ArrayList<Integer>(current));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(visited[i] == true){
                continue;
            }
            if(i > 0 && nums[i] == nums[i - 1] && visited[i -1] == false){
                continue;
            }
            current.add(nums[i]);
            visited[i] = true;
            process(nums, r, visited, current);
            visited[i] = false;
            current.remove(current.size() - 1);
        }
        return;
    }
}