package com.poorak.pie.recursion;

public class BinarySearch {
    public int find(int[] arr, int element){
        if(arr.length ==0) return -1;
        if(arr[0] > arr[arr.length-1]) return -2;
        return find(arr, 0, arr.length, element);
    }

    private int find(int[] arr, int start, int end, int element) {
        if(end < start) return -1;
        int mid = (start+end)/2 ;
        if(arr[mid] == element) return mid;
        if(element > arr[mid]) return find(arr, mid+1, end, element);
        else return find(arr, start, mid-1, element);
    }
}
