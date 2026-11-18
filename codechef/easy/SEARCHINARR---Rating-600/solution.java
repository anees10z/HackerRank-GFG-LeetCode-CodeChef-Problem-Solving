public static String solve(int N, int X, int[] A) {
    int l = 0;
    int r = N - 1;
    while (l <= r) {
        if (A[l] == X || A[r] == X) {
            return new String("Yes");
        }
        l++;
        r--;
    }
    return new String("No");
}