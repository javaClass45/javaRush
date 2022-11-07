package com.interview.task115;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 0, 12, 9};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));


    }

    public static void moveZeroes(int[] nums) {
        int counterWithoutNulls = 0;
        int counterWithNulls = 0;
        int length = nums.length;
        while (counterWithNulls < length) {
            if (nums[counterWithNulls] == 0) counterWithNulls++;
            else nums[counterWithoutNulls++] = nums[counterWithNulls++];
        }
        while (counterWithoutNulls < length) nums[counterWithoutNulls++] = 0;

    }


}
