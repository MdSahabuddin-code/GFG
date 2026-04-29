class Solution {
    int countTriplets(int target, int arr[]) {
        int i,left, right, sum, final_sum=0;
        int n=arr.length;
        Arrays.sort(arr);
        
        for (i=0; i<n-2; i++){
            left=i+1;
            right=n-1;
            
            while (left<right){
                sum = arr[i]+arr[left]+arr[right];
                if (sum >=target){
                    right--;
                }
                else{//sum < target
                    final_sum=final_sum+(right-left);
                    left++;
                }
            }
        }
        return final_sum;
    }
}