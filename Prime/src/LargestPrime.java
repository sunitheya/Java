public class LargestPrime {
    public static double getLargestPrime(int number){
        if(number <= 1){
            return -1;
        } else{
            int i;
            for( i = 2; i <= number; i++ ) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
                return i;
        }
    }

}
