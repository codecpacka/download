class a{
    String name;
    public void setName(String n)
        {
            name=n;
        }
   public  void showName()
    {
        System.out.println("name= "+name);
    }
}

class b extends a{
    int age;
    public void setAge(int a)
    {
        age=a;
    }
    public void showAge()
    {
        System.out.println("age= "+age);
    }
}

/**
 * ex
 */
public class ex {

    public static void main(String[] args) {

        b b1=new b();
        b1.setName("hra");
        b1.setAge(34);
    }
}

