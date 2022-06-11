package com.company;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int number = 0;
        System.out.println("Enter a series of numbers ending with 0: ");
        while(input.hasNextInt()){
            number = input.nextInt();
            list.add(number);
            if(number == 0) break;
        }
        func1((ArrayList) list);
    }

    static void func1(ArrayList list) {
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = (int) list.get(i);
        }
        subsequence(arr);
    }
    static void subsequence(int[] arr) {
        int values = 1;
        int num = arr[0];
        int val2 = 0;
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                if(values > val2){
                    num = arr[i-1];
                    val2 = values;
                    index = i - val2;
                }
                values = 1;
            }
            else values++;
            if(val2 >= arr.length) break;
        }
        if(values > val2){
            val2 = values;
            num = arr[arr.length - 1];
        }
        System.out.println("The longest same number sequence starts at index " + index + " with " + val2 + " values of " + num);
    }
}
/* 2 4 4 8 8 8 8 2 4 4 0
    2 4 values(1) > val2(0)  num = 2  val2(0) = values(1) index = 0
    4 4 values = 0 + 1
    4 8 values = 1
    8 8 values = 1 + 1
    8 8 values = 2 + 1
    8 8 values = 3 + 1
    8 2 values(4) > val2(1) num = 8 val2 = 4 index = 3  values = 1
    2 4 values = 1
    4 4 values = 1 + 1
    4 0 values(2) !> val2(4) values = 1
 */
