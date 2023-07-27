import java.util.Scanner;
public class LeapYear {
    static boolean isLeapYear (int year) {
        if(year%4 == 0){
            if(year%100 == 0 && year%400 != 0){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int y = sc.nextInt();
        boolean isYear = isLeapYear(y);
        if (isYear){
            System.out.println("The year " + y + " is a leap year.");
        } else{
            System.out.println("The year " + y + " is not a leap year.");
        }
        sc.close();
    }
}
