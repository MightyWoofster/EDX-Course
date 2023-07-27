public class AuctionItem extends Item{
    private int daysLeft;
    private double currentBid;
    private User highBidder;
    public AuctionItem(String name, double listCost, User owner, int daysLeft){
        super(name, listCost, owner, true);
        currentBid = listCost;
        highBidder = null;
        this.daysLeft = daysLeft;
    }
    public int getDaysLeft(){
        return daysLeft;
    }
    public double getCurrentBid(){
        return currentBid;
    }
    public void advanceDay(){
        if(this.getForSale() == true && this.daysLeft <= 0){
            if (highBidder != null){
                this.getOwner().updateBalance(this.currentBid);
                highBidder.updateBalance(-this.currentBid);
                this.setOwner(highBidder);
                highBidder = null;
                this.resetAuction(0.0, 0);
                this.toggleForSale();
            }
        }else if (daysLeft > 0){
            daysLeft--;
        }else{
            return;
        }
    }
    public String makeBid(User person, double bid){
        if (this.getForSale() == true && bid > currentBid){
            highBidder = person;
            currentBid = bid;
        }
        return highBidder.getName();
    }
    public void resetAuction(double startingBid, int numDaysLeft){
        if (highBidder == null){
            currentBid = startingBid;
            daysLeft = numDaysLeft;
        }
    }
    public String toString(){

        if(getForSale() == true){
            if (highBidder == null){
                if (daysLeft == 1){
                    return getName() + " ($" + currentBid + ", None, " + daysLeft + " day left)";
                }
                return getName() + " ($" + currentBid + ", None, " + daysLeft + " days left)";
            }
            if (daysLeft == 1){
                return getName() + " ($" + currentBid + ", " + highBidder.getName() + ", " + daysLeft + " day left)";
            }
            return getName() + " ($" + currentBid + ", " + highBidder.getName() + ", " + daysLeft + " days left)";
        } else{
            return super.toString();
        }
    }
    

}
