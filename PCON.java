import java.util.Scanner;

public class PCON {

    int a ; double b; String c;

    private PCON()
    {
        a=10; b=30.56; c="Welcome";

        System.out.println(a+" "+b+" "+c);

    }

    public static void main(String []args)
    {
        PCON Obj=new PCON();
    }
    
}
