class Solution {
    public boolean isPalindrome(String s) {
      int left = 0;
      int right = s.length()-1;
      while(left<right){
       char leftchar = s.charAt(left);
       char rightchar = s.charAt(right);
        if(!Character.isLetterOrDigit(leftchar)) left++;
        //here we are checking the non alphanumeric cahracter is available to incremenet the left
        else if(!Character.isLetterOrDigit(rightchar)) right-- ;
        else if(Character.toLowerCase(leftchar)!= Character.toLowerCase(rightchar))  return false;
    
       else{
        left++;
        right--;
        }
      }
    return true;
}
}