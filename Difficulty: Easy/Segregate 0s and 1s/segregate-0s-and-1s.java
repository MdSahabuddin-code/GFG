class Solution {
    
    public void swap(int[] nums, int a, int b){
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
    }
    
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int left=0, right = n-1;
        
        while (left<right){
            if(arr[left]==0 && arr[right]==0) left++;
            else if (arr[left]==1 && arr[right]==1) right--;
            else if (arr[left]==0 && arr[right]==1){
                left++;
                right--;
            }
            else{
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }
}
