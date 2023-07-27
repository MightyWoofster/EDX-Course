public class Test {
    public static void main (String[] args){
        Hotel hilton = new Hotel("Hilton", 120, 12);
        System.out.println(hilton.getTotalRooms());
        hilton.rentRoom("double queen", "Sophia", 3);
        System.out.println(hilton.getNumberOccupied());
        System.out.println(hilton.getOccupancyRate());
        

    }
}
