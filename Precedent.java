public class Precedent{
    public static String whatsbefore(String a, String b){
        int ind = b.indexOf(a);
        return b.substring(0, ind);
    }
    public static void main (String[] args){
        String cat = whatsbefore("cat", "A kittycat is at the door");
        System.out.println(cat);
        String dog = whatsbefore("dog", "A kittycat is at the door");
        System.out.println(dog);

    }
}