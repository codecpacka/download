/**
 * ExStatic
 */
public class ExStatic {
static int x;

static{
    System.out.println("this is static block ");
}

public static void Setvalue(int p){
    x=p;
    
}
    public static void main(String[] args) {
        ExStatic s=new  ExStatic();
        s.Setvalue(2);
        System.out.println(x);    
    }
}