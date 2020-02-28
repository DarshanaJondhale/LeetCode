public class Reverse{
    public static void main(String[] args){
        System.out.println(reverse("1002"));
    }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            x /= 10;
            //Before adding the po
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && last > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && last < -8)) return 0;
            rev = rev * 10 + last;
        }
        return rev;
    }
}