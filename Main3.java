package com.company;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        reverse(list);
        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();

        LinkedList<Integer> list1 = new LinkedList<>(list);
        reverse(list1);
        System.out.println("Linked list: ");
        for (int i: list1) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static <E> ArrayList<E> reverse(ArrayList<E> list){
        int n = list.size();
        for(int i = 0; i < n/2; i++){
            final E ele = list.get(i);
            list.set(i, list.get(n - i - 1));
            list.set(n - i - 1, ele);
        }
        return list;
    }
    public static <E> LinkedList<E> reverse(LinkedList<E> list){
        return list;
    }
}
