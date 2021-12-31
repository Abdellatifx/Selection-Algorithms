package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianCalculator {


}

class divide extends MedianCalculator{
    void calculateMedian(int[] ar1,int[] ar2,int n){
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        for (count = 0; count <= n; count++)
        {

            if (i == n)
            {
                m1 = m2;
                m2 = ar2[0];
                break;
            }


            else if (j == n)
            {
                m1 = m2;
                m2 = ar1[0];
                break;
            }

            if (ar1[i] <= ar2[j])
            {

                m1 = m2;
                m2 = ar1[i];
                i++;
            }
            else
            {

                m1 = m2;
                m2 = ar2[j];
                j++;
            }
        }

    }

}
class MedianOfMedians extends MedianCalculator {
    private int medianOfMedians(int[] nums)
    {
        if (nums.length <= 5)
        {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
        int groups = nums.length/5;
        if (nums.length%5 != 0)
            groups ++;
        int [] medians = new int[groups];
        for (int i = 0; i < nums.length; i += 5)
        {
            if (i+4 < nums.length)
                medians[i/5] = medianOfMedians(Arrays.copyOfRange(nums, i, i+5));
            else
            {
                if (i == nums.length-1)
                    medians[i/5] = nums[i];
                else
                    medians[i/5] = medianOfMedians(Arrays.copyOfRange(nums, i, nums.length));
            }
        }
        return medianOfMedians(medians);
    }
    public int findMedian(int[] array){
        int index=array.length/2;
        ArrayList<Integer> low = new ArrayList<Integer>();
        ArrayList<Integer> high = new ArrayList<Integer>();
        int median=medianOfMedians(array);
        if(array[index]==median)
            return median;
        for(int i=0;i<index;i++){

        }
        }
    }
}