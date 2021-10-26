/*

350. Intersection of Two Arrays II
Easy

3253

582

Add to List

Share
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
Accepted
633,483
Submissions
1,178,020


*/

class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        int map[] = new int[1001]; // map of maximum number of array value(i.e. as per constraint given in question, 0 <= nums1[i], nums2[i] <= 1000)
        int res[]  = new int[Math.min(arr1.length, arr2.length)]; // let resultant array of size of smaller array
        for (int i = 0; i < arr2.length; i++) { // we can take one array into map to count its frequencies (i.e. number of times element appear in array)
            map[arr2[i]]++; // put elements of second array in map
        }
        int j = 0; // resultant array start index
        for (int i = 0; i < arr1.length; i++) {
            if (map[arr1[i]] > 0) { // if frequency of value is greater than 0 then add that element to array
                res[j++] = arr1[i];
                map[arr1[i]]--; // decrement its count
            }
        }
        
        return Arrays.copyOf(res, j); // return resultant array with range upto size length of last added element
    }
}
