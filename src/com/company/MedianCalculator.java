package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianCalculator {
    public MedianCalculator() {
    }

    List calculateMedian(int[] array, int low, int high) {
        List<Integer> medianArray = new ArrayList<Integer>();

        return medianArray;

    }


}

class divide extends MedianCalculator {
    int mid;
    List<Integer> medianArray = new ArrayList<Integer>();

    List calculateMedian(int[] array, int low, int high) {
        if (array.length <= 5) {
            Arrays.sort(array);
            medianArray.add(array[(array.length / 2)]);
            return medianArray;
        } else {
            calculateMedian(array, low, low + 4);
            calculateMedian(array, low + 5, high);
        }
        return medianArray;
    }

}
