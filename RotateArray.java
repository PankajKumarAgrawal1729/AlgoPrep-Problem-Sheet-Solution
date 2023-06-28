// https://leetcode.com/problems/rotate-array/


class Solution{

    public void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public void rotate(int[] arr, int k){
        int n = arr.length;
        k %= n;
        //right rotation(T.c. : O(n))
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);


        //left rotation(T.c. : O(n))
        // reverse(arr, 0, k - 1);
        // reverse(arr, k, n - 1);
        // reverse(arr, 0, n - 1);
    }
}