/**
 * ExThis
 */
public class ExThis {
    int x;
    public void test(int x){
        this.x=x;
        System.out.println("x = "+x);
    }

    public static void main(String[] args) {
        ExThis t=new ExThis();
        t.test(3);
    }
}