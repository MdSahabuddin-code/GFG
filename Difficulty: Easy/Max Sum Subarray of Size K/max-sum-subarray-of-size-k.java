class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int res = Integer.MIN_VALUE, sum = 0, low = 0, high = k - 1;
        for (int i = low; i <= high; i++)
            sum = sum + arr[i];

        while (high < n) {
            res = Math.max(res, sum);
            low++;
            high++;
            if (high == n) {
                break;
            }
            sum = sum - arr[low - 1] + arr[high];
        }
        return res;
    }
}
  