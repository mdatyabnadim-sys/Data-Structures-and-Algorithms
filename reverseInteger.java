class reverseInteger{
    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            x *= -1;
            flag = true;
        }
        int rev = 0;
        while (x != 0) {
            if (rev >(Integer.MAX_VALUE-(x%10))/10)  return 0;
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        if (flag == true)  rev *= -1;
            return rev;
    }
}