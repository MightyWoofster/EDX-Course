public class Hotel {
    private String hotelName;
    private Room[] rooms;
    private int totalRooms;

    public Hotel (String hotelName, int totalRooms, int numFloors){
        this.totalRooms = totalRooms;
        rooms = new Room[totalRooms];
        int roomPerFloor = totalRooms/numFloors;
        String type;
        for (int f = 1; f <= numFloors; f++){
            for (int r = 0; r < roomPerFloor; r++){
                if (r < roomPerFloor-5){
                    type = "double queen";
                } else if (r < roomPerFloor-1){
                    type = "single king";
                } else{
                    type = "suite";
                }
                rooms[(f-1)*roomPerFloor+r] = new Room(f*100+r, type);
            }

        }
    }
    public int getTotalRooms(){
        return totalRooms;
    }
    public int getNumberOccupied(){
        int numOccupied = 0;
        for(Room r : rooms){
            if(r.getOccupantName() != null){
                numOccupied++;
            }
        }
        return numOccupied;

    }
    public double getOccupancyRate(){
        double rate = (double) getNumberOccupied()/totalRooms;
        rate = Math.round(rate*100)/100;
        return rate;
    }
    public boolean rentRoom(String type, String name, int days){
        for(int i = 0; i < totalRooms; i++){
            if (rooms[i].getRoomType() == type && rooms[i].getOccupantName() == null){
                rooms[i].setOccupant(name, days);
                return true;
            } 
        }
        return false;

    }
    public void advanceDay(){
        for(Room r : rooms){
            if (r.getDaysRented() > 0){
                r.advanceDay();
            }
        }

    }
    public String toString(){
        return hotelName + ": " + (getOccupancyRate()*100) + "%";
    }

}
