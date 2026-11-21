class Solution {
	public int moreFrequent(List<Integer> arr, int x, int y) {
		// code here
		int xCount = 0;
		int yCount = 0;
		
		for (int num : arr) {
			if (num == x)
				xCount++;
			if (num == y)
				yCount++;
		}
		
		if (xCount == yCount)
			return (x < y)? x : y;
		return (xCount > yCount)? x : y;
	}
}
