public class DiagonalStar {
    public  static void printSquareStar(int number){
        int currRow;
        int currColumn;
        if(number < 5){
            System.out.println("Invalid Line");
        } else {
            for(currRow = 1; currRow <= number; currRow++){
                for(currColumn = 1; currColumn <= number; currColumn++){
                    // Create Exception
                    if((currColumn == 1 || currColumn == number) || ( currRow == 1 || currRow == number)){
                        System.out.print("*");

                    } else if( currColumn == currRow){
                        System.out.print("*");
                    } else if(currColumn == (number - currRow+1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println(" ");
            }

        }

    }
}
