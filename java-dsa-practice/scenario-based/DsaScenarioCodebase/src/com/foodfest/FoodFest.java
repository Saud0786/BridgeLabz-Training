package com.foodfest;

public class FoodFest {

    public static void mergeSort(Stall[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(Stall[] arr, int left, int mid, int right) {

        Stall[] temp = new Stall[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].footfall <= arr[j].footfall) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {

        Stall[] stalls = {
            new Stall("StallA", 120),
            new Stall("StallB", 150),
            new Stall("StallC", 150),
            new Stall("StallD", 200),
            new Stall("StallE", 180)
        };

        mergeSort(stalls, 0, stalls.length - 1);

        for (Stall s : stalls) {
            System.out.println(s);
        }
    }
}
