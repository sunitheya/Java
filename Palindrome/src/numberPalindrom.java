public class numberPalindrom {
    public static boolean isPalindrome(int number) {
        int num = number;
        int reverse = 0;
        int r;
        while (number > 0) {
            r = number%10;
            reverse = (reverse * 10) + r;
            number = number / 10;
            System.out.println(number );
        }
        if (num == reverse)
                return true;
        else return false;

        }
    }


