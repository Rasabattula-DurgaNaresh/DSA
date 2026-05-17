public class Solution {
  public int[] mergeSort(int[] array) {
    // Write your solution here
    mergeSortHelper(array, 0, array.length-1);
    return array;
  }
  
  private void mergeSortHelper(int[] arr, int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSortHelper(arr, start, mid);
      mergeSortHelper(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }
  
  private void merge(int[] arr, int start, int mid, int end) {
    int p = start;
    int q = mid + 1;
    int[] temp = new int[end - start + 1];
    int k = 0;
    
    for (int i=start; i<=end; i++) {
      if (p > mid) {
        temp[k++] = arr[q++];
      }
      else if (q > end) {
        temp[k++] = arr[p++];
      }
      else if (arr[p] < arr[q]) {
        temp[k++] = arr[p++];
      }
      else {
        temp[k++] = arr[q++];
      }
    }
    
    for (p=0; p<k; p++) {
      arr[start++] = temp[p];
    }
  }
}

