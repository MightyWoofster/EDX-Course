import java.util.Scanner;
public class Associative {
    int a;
    int b;
    int c;
    public Associative(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int firstTwo(){
        return (a+b)*c;
    }
    public int lastTwo(){
        return a+(b*c);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Associative asc = new Associative(x, y, z);
        int first = asc.firstTwo();
        int last = asc.lastTwo();
        System.out.println("Grouping the first two terms, (" + x + "+" + y +")" + "*" + z + " = " + first);
        System.out.println("Grouping the last two terms, " + x + "+(" + y + "*" + z + ") = " + last);
        sc.close();
    }
}
