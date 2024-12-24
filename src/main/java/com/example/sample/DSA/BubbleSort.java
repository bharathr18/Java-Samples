// Start
// Initiate two values n as size of array ,also i and j to traverse array.
// Put i=0 and j=1.
// While traversing if array[i] > array[j] swap both the numbers.
// Increment the value i and j then goto Step 3.
// If the value of i > n-1 and j > n and n>1 then
//        n=n-1
// goto Step 2
// Exit
package com.example.sample.DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {12, 6, 2, 9, 13, 25};
        BubbleSort b1 = new BubbleSort();
        b1.bubbleSort(a);
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    void bubbleSort(int[] a)
    {
        int n = a.length;

        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
