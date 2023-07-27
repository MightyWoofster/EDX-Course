public class AboutMe {
    String myName(String name){
        return name;
    }
    String mySchool(String school){
        return school;
    }
    int myAge(int age){
        return age;
    }
    public static void main (String[] args){
        AboutMe sophia = new AboutMe();
        String n = sophia.myName("Sophia");
        String s = sophia.mySchool("Northwood High School");
        int a = sophia.myAge(16);
        System.out.println("My name is " + n + ", and I attend " + s + ". I am " + a + " years old.");
    }
}