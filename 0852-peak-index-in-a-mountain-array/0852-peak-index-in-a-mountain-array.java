class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid==arr.length-1||arr[mid]>arr[mid+1]){
                index = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
         return index;
    }
}