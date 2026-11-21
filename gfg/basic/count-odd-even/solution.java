class Solution {
	public int[] countOddEven(int[] arr) {
		// Code here
		int even = 0;
		for (int num: arr) {
			if ((num & 1) == 0)
				even++;
		}
		
		return new int[] {arr.length - even, even};
	}
}
