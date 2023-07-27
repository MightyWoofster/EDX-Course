import java.util.Scanner;
public class Rewards {
    int points;
    public Rewards(int points){
        this.points = points;
    }
    public String showRewards(int rewardPoints){
        String s;
        if (rewardPoints >= 5000) {
            s = "1) free coffee - 50 pts\n2) free baked good - 100 pts\n3) free specialty coffee - 200 pts\n4) 1% store ownership = 5000 pts";
        }
        else if (rewardPoints >= 200){
            s = "1) free coffee - 50 pts\n2) free baked good - 100 pts\n3) free specialty coffee - 200 pts";
        }
        else if (rewardPoints >= 100){
            s = "1) free coffee - 50 pts\n2) free baked good - 100 pts";
        }
        else if (rewardPoints >= 50) {
            s = "1) free coffee - 50 pts";
        }
        else{
            s = "Not enough points";
        }
        return "Choices:\n" + s;
    }
    public String getReward(int choice){
        switch (choice){
            case 1:
                if (points >= 50){
                    return "You have selected a free coffee! Remaining number of points: " + (points-50);
                }
                else{
                    return "You do not have enough points for that reward.";
                }
            case 2: 
                if (points >= 100){
                    return "You have selected a free baked good! Remaining number of points: " + (points-100);
                }
                else{
                    return "You do not have enough points for that reward.";
                }
            case 3: 
                if (points >= 200){
                    return "You have selected a free specialty coffee! Remaining number of points: " + (points-200);
                }
                else{
                    return "You do not have enough points for that reward.";
                }
            case 4: 
                if (points >= 5000){
                    return "You have selected 1% store ownership! Remaining number of points: " + (points-5000);
                }
                else{
                    return "You do not have enough points for that reward.";
                }
            default:
                return "Invalid choice, please select again.";
                
        }

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of points:");
        int pts = sc.nextInt();
        Rewards cust = new Rewards(pts);
        String show = cust.showRewards(pts);
        System.out.println(show);
        if (pts >= 50){
            System.out.println("Enter your choice number:");
            int choice = sc.nextInt();
            String get = cust.getReward(choice);
            System.out.println(get); 
        }
        sc.close();
    }
}
