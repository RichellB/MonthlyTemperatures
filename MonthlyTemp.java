import java.util.Scanner;

public class MonthlyTemp {

    public static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static int[] temp = {21, 23, 27, 30, 42, 77, 85, 91, 68, 36, 23, 19};


    // function to display all the year's temperatures and temperature statistics
    public static void displayAllTempData() {

        // variable declarations and initializations
        int avgTemp;
        int sum = 0;
        int minTemp = 999;
        int maxTemp = -1;
        
        System.out.println("\nViewing All Monthly Temperatures:");

        // loop to print each month's temperature
        for (int i=0; i < months.length; i++) {
            System.out.println("The temperature for " + months[i] + " is " + temp[i] + " degrees Celcius.");
        }
            
        // loop to calculate the average, minimum and maximum temperatures
        for (int j = 1; j < temp.length; j++) {
            sum = sum + temp[j];
    
            if (temp[j] < minTemp) {
                minTemp = temp[j];
            }
            if (temp[j] > maxTemp) {
                maxTemp = temp[j];
            }
        }
    
        avgTemp = sum / temp.length;
            
        // displaying temperature statistics to user
        System.out.println("\nViewing Temperature Statistics:");
        System.out.println("The average temperature is: " + avgTemp + " degrees Celcius.");
        System.out.println("The lowest temperature is: " + minTemp + " degrees Celcius.");
        System.out.println("The highest temperature is: " + maxTemp + " degrees Celcius.");

    }
    
    public static void main(String[] args){

        System.out.println("Please enter a month to view its temperature.\nEnter 'year' to view all months.\n");
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();

        switch(month){
            case "January":
                System.out.println("The temperature for " + months[0] + " is " + temp[0] + " degrees Celcius.");
            break;

            case "February":
                System.out.println("The temperature for " + months[1] + " is " + temp[1] + " degrees Celcius.");
            break;

            case "March":
                System.out.println("The temperature for " + months[2] + " is " + temp[2] + " degrees Celcius.");
            break;

            case "April":
                System.out.println("The temperature for " + months[3] + " is " + temp[3] + " degrees Celcius.");
            break;

            case "May":
                System.out.println("The temperature for " + months[4] + " is " + temp[4] + " degrees Celcius.");
            break;

            case "June":
                System.out.println("The temperature for " + months[5] + " is " + temp[5] + " degrees Celcius.");
            break;

            case "July":
                System.out.println("The temperature for " + months[6] + " is " + temp[6] + " degrees Celcius.");
            break;

            case "August":
                System.out.println("The temperature for " + months[7] + " is " + temp[7] + " degrees Celcius.");
            break;

            case "September":
                System.out.println("The temperature for " + months[8] + " is " + temp[8] + " degrees Celcius.");
            break;

            case "October":
                System.out.println("The temperature for " + months[9] + " is " + temp[9] + " degrees Celcius.");
            break;

            case "November":
                System.out.println("The temperature for " + months[10] + " is " + temp[10] + " degrees Celcius.");
            break;

            case "December":
                System.out.println("The temperature for " + months[11] + " is " + temp[11] + " degrees Celcius.");
            break;

            case "year":
                displayAllTempData();
            break;

            default:
                System.out.println("That was not a valid month. Please try again.");
            break;

        }
    }
}
