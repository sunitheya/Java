import java.util.Scanner;

public class inputThenPrintSumAndAverage {
    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        int count = 0;
        double avg = 0;

        while(true){
            System.out.println("Enter Number :");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                count = count+1;
                number = scanner.nextInt();
                sum += number;
                avg = sum/count;
                long avground = Math.round(avg);
            } else{
                break;
            }
            scanner.nextLine();  //handle input


        }
        System.out.println("SUM ="+sum+" AVG ="+avg);
        scanner.close();
    }
}
