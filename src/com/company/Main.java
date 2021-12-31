package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
    int[] array = {5,8,12,1,99,74,61,9,20,30};
    int x;
	MedianOfMedians obj1 = new MedianOfMedians();
    x=obj1.findMedian(array);
    System.out.println(x);
    }
}
