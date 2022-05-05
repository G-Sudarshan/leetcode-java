class Solution {
 
    String[] nums = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList();
        }
        
        List<String> res = getCombinations(digits);
        return res;
    }
    
    public List<String> getCombinations(String digits){
        if(digits.length() == 0){
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        char ch = digits.charAt(0);
        String remDigits = digits.substring(1);
        List<String> remaining_result = getCombinations(remDigits);
        List<String> this_itration_result = new ArrayList<>();
        
        for(int i=0; i<nums[ch-'0'].length(); i++){
            char nums_ch = nums[ch-'0'].charAt(i);
            for(String ele: remaining_result){
                this_itration_result.add(nums_ch + ele);
            }
        }
        return this_itration_result;
    }
}