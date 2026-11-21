class Solution {
	public int countDistinct(int arr[]) {
		// code here
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		
		for (int num : arr) {
			if (!set.contains(num))
				count++;
			set.add(num);
		}
		
		return count;
	}
}
