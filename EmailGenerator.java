import java.util.Scanner;
public class EmailGenerator {
    public static String makeUsername(String a, String b){
        String username = a.substring(0, 1) + b;
        return username.toLowerCase();
    }
    public static String makeEmail(String x, String y){
        return x + "@" + y;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String first = sc.nextLine();
        System.out.println("Enter last name:");
        String last = sc.nextLine();
        String user = EmailGenerator.makeUsername(first, last);
        String email = EmailGenerator.makeEmail(user, "gmail.com");
        System.out.println("This user's e-mail is: " + email);
        sc.close();
    }
}
