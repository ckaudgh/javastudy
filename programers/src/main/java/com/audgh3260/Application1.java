package com.audgh3260;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hset.add(nums[i]);
        }
        if(hset.size()<nums.length/2) answer = hset.size();
        else answer = nums.length/2;
        return answer;
    }
}
public class Application1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2,2,2,3,3,3,2,2}));
    }
}