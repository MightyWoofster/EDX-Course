public class ParkingSpace {
    int spaceNum;
    char floor;
    boolean isCompact;
    boolean isOccupied;

    public ParkingSpace(int spaceNum, char floor, boolean isCompact){
        this.spaceNum = spaceNum;
        this.floor = floor;
        this.isCompact = isCompact;
        this.isOccupied = false;
    }

    public int getSpaceNum(){
        return spaceNum;
    }
    public char getFloor(){
        return floor;
    }
    public boolean getCompact(){
        return isCompact;
    }
    public boolean getOccupied(){
        return isOccupied;
    }
    public void setOccupied(boolean isOccupied){
        this.isOccupied = isOccupied;
    }
    public String toString(){
        String spaceType = isCompact ? "C" : "N";
        String occupiedStatus = isOccupied ? "X" : "O";
        return floor + spaceNum + " (" + spaceType + " " + occupiedStatus + ")";
    }
}
