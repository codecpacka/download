import roomc.Room;/**
 * Reuse
 */
public class Reuse {
    public static void main(String[] args) {
        System.out.println("reusing class room ");
        Room  r=new Room();
        r.setData(2, 6, "ac", "rt");
        r.showData();
    }

    
}
