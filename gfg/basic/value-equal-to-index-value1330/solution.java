class Solution {
	public static ArrayList<Integer> valEqualToPos(int[] arr) {
		// code here
		ArrayList<Integer> res = new ArrayList<>();
		int len = arr.length;
		for (int i = 0; i<len; i++) {
			if (arr[i] == i + 1) {
				res.add(arr[i]);
			}
		}
		return res;
	}
}
