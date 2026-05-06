class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;//it reprsent the index of merge array
        while(i>=0&&j>=0){//3,6,k=5
            if(nums1[i]>nums2[j]){
               nums1[k] = nums1[i];
               i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;

        }
        while(j>=0){// if nums2 have element
            nums1[k] = nums2[j];
            j--;
            k--;

        }
    }
}