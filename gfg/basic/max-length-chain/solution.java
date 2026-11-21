class Solution {
	public int sumExceptFirstLast(int[] arr) {
		// code here
		int len = arr.length;
		int sum = 0;
		for (int i = 1; i < len - 1; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
