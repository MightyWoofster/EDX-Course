public class Room{
    private int roomNumber;
    private int daysRented;
    private String roomType;
    private String occupantName;

    public Room(int roomNumber, String roomType){
        this.roomNumber = roomNumber;
        this.daysRented = 0;
        this.occupantName = null;
        if (roomType.equals("single king") || roomType.equals("double queen") ||roomType.equals("suite")){
            this.roomType = roomType;
        } else{
            this.roomType = "double queen";
        }

    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public int getDaysRented(){
        return daysRented;
    }
    public String getRoomType(){
        return roomType;
    }
    public String getOccupantName(){
        return occupantName;
    }
    public boolean setOccupant(String name, int days){
        if (this.occupantName != null){
            return false;
        }
        occupantName = name;
        daysRented = days;
        return true;
    }
    public void advanceDay(){
        daysRented--;
        if (daysRented <= 0){
            occupantName = null;
            daysRented = 0;

        }
    }
    public String toString(){
        String roomStatus;
        if (occupantName == null){
            roomStatus = "free";
        } else{
            roomStatus = "rented";
        }
        return "Room " + roomNumber + ": " + roomType + " - " + roomStatus;
    }

}