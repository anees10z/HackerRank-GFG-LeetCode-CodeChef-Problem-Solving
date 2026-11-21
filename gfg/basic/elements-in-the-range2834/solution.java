class Solution {
	public boolean checkElements(int start, int end, int[] arr) {
		// code here
		int count = end - start + 1;
		for (int num : arr) {
			if (num >= start && num <= end)
				count--;
		}
		return count == 0;
	}
}
