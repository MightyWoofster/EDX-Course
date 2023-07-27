public class User {
    private String name;
    private double accountBalance;
    public User(String name){
        this.name = name;
        this.accountBalance = 0;
    }
    public String getName(){
        return name;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public double updateBalance(double addBalance){
        accountBalance = accountBalance + addBalance;
        return accountBalance;
    }
    public String toString(){
        return getName() + "'s balance is $" + accountBalance;
    }
}
