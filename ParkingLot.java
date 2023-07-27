public class ParkingLot {
    ParkingSpace[] parkingLot;
    int numSpaces;
    int numFloors;
    
    public ParkingLot(int spaces, int floors){
        numSpaces = spaces;
        numFloors = floors;
        parkingLot = new ParkingSpace[numSpaces*numFloors];
        initializeParkingLot();
    }
    private void initializeParkingLot() {
        char floorLabel = 'A';
        int spaceNum = 0;

        for (int i = 0; i < parkingLot.length; i++) {
            boolean isCompact = spaceNum < 4;

            parkingLot[i] = new ParkingSpace(spaceNum, floorLabel, isCompact);

            spaceNum++;
            if (spaceNum == numSpaces) {
                spaceNum = 0;
                floorLabel++;
            }
        }
    }
    public ParkingSpace enterLot(boolean isCompact) {
        for (ParkingSpace space : parkingLot) {
            if ((!isCompact && !space.getCompact()) || isCompact) {
                if (!space.getOccupied()) {
                    space.setOccupied(true);
                    return space;
                }
            }
        }
        return null; // Handle the case where the parking lot is full
    }
    public void leaveLot(ParkingSpace obj){
        obj.setOccupied(false);
    }
}
