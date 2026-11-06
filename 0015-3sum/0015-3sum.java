class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;++i){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int n1 = nums[i];

            // Remaining two numbers ka target
            int target = -n1;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[j] + nums[k];

                if (sum < target) {
                    j++;
                }

                else if (sum > target) {
                    k--;
                }

                else {
                    List<Integer> temp = Arrays.asList(
                        n1, nums[j], nums[k]
                    );

                    ans.add(temp);

                    j++;
                    k--;

                    // Skip duplicates
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }
}
        
    