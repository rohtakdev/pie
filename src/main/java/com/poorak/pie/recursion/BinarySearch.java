package com.poorak.pie.recursion;

public class BinarySearch {
    public int find(int[] arr, int element){
        if(arr.length ==0) return -1;
        return find(arr, 0, arr.length-1, element);
    }

    private int find(int[] arr, int start, int end, int element) {
        int range = end-start;
        if(range < 0) return -1;
        if(arr[start] > arr[end]) return -2;
        int mid = (range)/2  + start;
        if(arr[mid] == element) return mid;
        if(element > arr[mid]) return find(arr, mid+1, end, element);
        else return find(arr, start, mid-1, element);
    }

    public int find_i(int[] arr, int element){
        if(arr.length ==0) return -1;
        int start= 0;
        int mid= 0;
        int end= arr.length -1;
        int range = end-start;
        while(range > 0){
            if(arr[start] > arr[end]) return -2;
            mid = range/2 + start;
            if(element == arr[mid]) return mid;
            if(element > arr[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
            range = end - start;
        }
        return -1;
    }
}
