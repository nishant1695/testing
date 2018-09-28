package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of integers to be entered: ");
        int number = scan.nextInt();
        int[] a = getintegers(number);
        printarray(a);
        int[] sorted = sortarray(a);
        printarray(sorted);
    }

    public static int[] getintegers(int number){
        int[] a = new int[number];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        return a;
    }

    public static int printarray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println("on position "+i+" is "+a[i]+"\n");
        }
        System.out.println("\n\n\n\n\n\n\n");
        return 0;
    }

    public  static int[] sortarray(int[] a){
        boolean flag = true;
        while(flag) {
            flag=false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return a;
    }
}
