package com.bakhromjonov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) if (nums[i] == target) arr.add(i);
        return arr;
    }

    public static void main(String[] args) {
        var leetcode2089 = new Leetcode2089();
        int[] nums = {6, 12, 35, 10, 9, 14, 5};
        System.out.println(leetcode2089.targetIndices(nums, 35));
    }
}