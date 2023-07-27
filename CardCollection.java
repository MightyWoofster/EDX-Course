import java.util.List;
import java.util.ArrayList;

public class CardCollection {
    private String owner;
    private List<Card> myCollection;
    public CardCollection(String owner){
        this.owner = owner;
        myCollection = new ArrayList<Card>();
    }
    public boolean addCard(Card c){
        int i = 0;
        while(i < myCollection.size()){
            if(myCollection.get(i).compareTo(c) == 0){
                return false;
            }
            if(myCollection.get(i).compareTo(c) > 0){
                myCollection.add(i, c);
                return true;
            }
            i++;
        }
        myCollection.add(c);
        return true;
    }
    public void removeCard(int index){
        myCollection.remove(index);
    }
    public int getSize(){
        return myCollection.size();
    }
    public List<Card> mergeCollections(CardCollection cc){
        List<Card> duplicates = new ArrayList<Card>();
        while (cc.getSize() > 0){
            Card c = cc.myCollection.remove(0);
            if(this.addCard(c) == false){
                duplicates.add(c);
            } else{
                myCollection.add(c);
            }
        }
        return duplicates;
    }
    public String toString(){ 
        String x = "";
        for(int i = 0; i<owner.length(); i++){
            x = x + "-";
        }
        String y = "";
        for(int j= 0; j < this.myCollection.size(); j++){
            y = y + ((Card) this.myCollection.get(j)).toString() + "\n";
        }

        return owner + "\n" + x + "\n" + y ;

    }

}
