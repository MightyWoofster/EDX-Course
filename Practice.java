public class Practice implements Comparable<Practice> {

     private int a, b;

     public Practice(int a, int b) {
          this.a = a;
          this.b = b;
     }
     public int compareTo(Practice other)
     {
      if(this.a>other.a){
         return 1;
      } else if (this.a<other.a){
         return -1;
      } else if(this.b>other.b){
         return 1;
      } else if (this.b<other.b){
         return -1;
      } else{
         return 0;
      }
     }

     public static void main(String[] args) {
          Practice p1 = new Practice(2,3);
          Practice p2 = new Practice(4,1);
          Practice p3 = new Practice(2,3);
          Practice p4 = new Practice(2,4);
          Practice p5 = new Practice(2,1);
          System.out.println(p1.compareTo(p2));
          System.out.println(p1.compareTo(p3));
          System.out.println(p2.compareTo(p3));
          System.out.println(p1.compareTo(p4)); 
          System.out.println(p1.compareTo(p5)); 
     }
}