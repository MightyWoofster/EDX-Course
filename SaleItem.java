public class SaleItem extends Item {
    private double discount;
    public SaleItem(String name, double listCost, User owner, double discount){
        super(name, listCost, owner, true);
        this.discount = discount;
    }
    public String getDiscount(){
        return discount*100 + "%";
    }
    public void purchaseItem(User person){
        super.purchaseItem(person, this.getListCost()*(1-discount));
    }

}
