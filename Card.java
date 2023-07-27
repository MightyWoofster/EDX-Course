public class Card implements Comparable<Card>{
    private String name;
    private String nationality;
    private int yearBorn;
    private int yearDied;
    public Card(String name, String nationality, int yearBorn, int yearDied){
        this.name = name;
        this.nationality = nationality;
        this.yearBorn = yearBorn;
        this.yearDied = yearDied;
    }
    public int compareTo(Card other){
        if (this.name.equals(other.name)){
            return 0;
        } else if (this.name.compareTo(other.name) > 0){
            return 1;
        } else{
            return -1;
        }

    }
    public String toString(){
        
        if(yearDied == -1){
            return name + " (" + yearBorn + "-" + "Present) - " + nationality;
        }
        return name + " (" + yearBorn + "-" + yearDied + ") - " + nationality;
    }

}