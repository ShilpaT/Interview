package com.example.interview;

public class SortArrayExample {
    public static void swap( int [] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void sort(int [] arr){
        for(int i =0 ; i < arr.length ;i++){
            for( int j = i + 1; j< arr.length ; j++){
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }
    public static void main(String[] arg){
        int[] arr = {10, 2, 4, 1, 7, 20, 8};
        sort(arr);
        for(int i : arr){
            System.out.println(" " + i);
        }
    }
}
