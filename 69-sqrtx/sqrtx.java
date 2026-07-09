class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;

        int l = 1;
        int h = x / 2;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            long square = (long) mid * mid;

            if (square == x)
                return mid;
            else if (square < x)
                l = mid + 1;
            else
                h = mid - 1;
        }

        return h;
    }
}