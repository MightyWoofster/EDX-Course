public class Item{
    private String name;
    private double listCost;
    private User owner;
    private boolean forSale;
    public Item(String name, double listCost, User owner, boolean forSale){
        this.name = name;
        this.listCost = Math.round(100*listCost)/100.0;
        this.owner = owner;
        this.forSale = forSale;
    }
    public String getName(){
        return name;
    }
    public double getListCost(){
        return listCost;
    }
    public User getOwner(){
        return owner;
    }
    public boolean getForSale(){
        return forSale;
    }
    public void setOwner(User owner){
        this.owner = owner;
    }
    public void setListCost(double listCost){
        this.listCost = listCost;
    }
    public void toggleForSale(){
        if(forSale == true){
            forSale = false;
        } else{
            forSale = true;
        }
    }
    public void purchaseItem(User person, double money){
        person.updateBalance(-money);
        setOwner(person);
        toggleForSale();
    }
    public String toString(){
        return name + " ($" + listCost + " - " + owner.getName() + ")";
    }
}