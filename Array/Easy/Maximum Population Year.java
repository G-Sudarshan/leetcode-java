/*

1854. Maximum Population Year
Easy

285

44

Add to List

Share
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.

 

Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation: 
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 

Constraints:

1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050
Accepted
18,122
Submissions
31,291

*/

class Solution {
    public int maximumPopulation(int[][] logs) {
        int populationCount = 0;
        int[] years = new int[101]; //for storing the population of the respective year
        
        //calculating the population in each year
        for(int i=1950; i<=2050; i++){
            populationCount = 0;
            for(int j=0; j<logs.length; j++){
                if(logs[j][0] <= i && logs[j][1] > i){
                    populationCount++;
                }
            }
            years[i - 1950] = populationCount;
        }
        
        //finding the maximum population
        int maxCount = 0;
        for(int i=0; i<101; i++){
            if(maxCount < years[i]){
                maxCount = years[i];
            }
        }
        
        //finding the first year with maximum population
        int ans = 0;
        for(int i=0; i<101; i++){
            if(maxCount == years[i]){
                ans = i + 1950;
                break;
            }
        }
        return ans;
        
    }
}
