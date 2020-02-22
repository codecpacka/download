package roomc;
public class Room{
int roomno,roomarea;
String ACmachine,roomtype;
public void setData(int rn,int ra,String ac,String rt){
roomno=rn;
roomarea=ra;
ACmachine=ac;
roomtype=rt;
}

public void showData(){
    System.out.println("roomno "+roomno);
    System.out.println("roomarea "+roomarea);
    System.out.println("Acmachine "+ACmachine);
    System.out.println("roomtype "+roomno);

}

public static void main(String[] args) {
    Room r = new Room();
    r.setData(1, 56, "yes", "fur");
    r.showData();  
}

}