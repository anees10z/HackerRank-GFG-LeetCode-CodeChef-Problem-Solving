class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10)
            return false;
        int reduce = 10;
        n = n - reduce--;
        boolean turnAlice = false;
        boolean res = false;
        while (n > 0) {
            if (turnAlice) {
                if (n >= reduce) {
                    n = n - reduce--;
                    turnAlice = false;
                } else {
                    return false;
                }
            } else {
                if (n >= reduce) {
                    n = n - reduce--;
                    turnAlice = true;
                } else {
                    return true;
                }
            }
        }
        if (turnAlice)
            return false;
        else
            return true;
    }
}
// class Solution {
//     public boolean canAliceWin(int n) {
//         if (n < 10)
//             return false;
//         int reduce = 10;
//         n = n - reduce--;
//         boolean turnAlice = false;
//         boolean res = false;
//         while (true) {
//             if (turnAlice) {
//                 if (n >= reduce) {
//                     n = n - reduce--;
//                     turnAlice = false;
//                 } else {
//                     res = false;
//                     break;
//                 }
//             } else {
//                 if (n >= reduce) {
//                     n = n - reduce--;
//                     turnAlice = true;
//                 } else {
//                     res = true;
//                     break;
//                 }
//             }
//         }
//         return res;
//     }
// }

