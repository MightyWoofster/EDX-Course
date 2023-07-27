public class OnlineOrder {
    private String orderName;
    private double totalCost;
    private double tax;
    private int numTurkey;
    private int numItalian;
    private int numVeggie;
    private int numBLT;
    final double TAX_RATE = 0.07;
    public OnlineOrder(String name, int turkey, int italian, int veggie, int blt){
        orderName = name;
        numTurkey = turkey;
        numItalian = italian;
        numVeggie = veggie;
        numBLT = blt;
        totalCost = getTotalCost();
        tax = getTax();
    }
    public void changeOrder(int turkey, int italian, int veggie, int blt){
        if(turkey > 0){
            this.numTurkey = turkey;
        } else{
            this.numTurkey = 0;
        }
        if(italian > 0){
            this.numItalian = italian;
        } else{
            this.numItalian = 0;
        }
        if(veggie > 0){
            this.numVeggie = veggie;
        } else{
            this.numVeggie = 0;
        }
        if(blt > 0){
            this.numBLT = blt;
        } else{
            this.numBLT = 0;
        }
        totalCost = (4.99*(turkey+italian+blt)+3.99*veggie);
        this.tax = Math.round(100 * totalCost * TAX_RATE)/100.0;

    }
    public double getTotalCost(){
        changeOrder(numTurkey, numItalian, numVeggie, numBLT);
        return totalCost;

    }
    public double getTax(){
        changeOrder(numTurkey, numItalian, numVeggie, numBLT);
        return tax;
    }
    public String toString(){
        return orderName + ", your order comes to " + (Math.round(100*(getTotalCost() + getTax()))/100.0);

    }
    public static void main (String[] args){
        OnlineOrder order = new OnlineOrder("Sarah",0,0,1,1);
        System.out.println(order);
    }
    
}
