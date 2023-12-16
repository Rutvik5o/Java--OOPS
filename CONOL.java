//Default, Private constructor can't call at the same time
import java.util.Scanner;


class a
{
    int a; double b; String c;

    a()
    {
        a=100; b=45.42; c="Welcome";
    }

    a(int x)
    {
        a=x;
    }

    a(double y,String z)
    {
        b=y;
        c=z;
    }

}


class CONOL
{
    public static void main(String []args)
    {
        a obj=new a();
        a obj2=new a(10);
        a obj3=new a(34.34,"Welcome");

        System.out.println(obj.a+" "+obj.b+" "+obj.c);

        System.out.println(obj2.a);

        System.out.println(obj3.b+" "+obj3.c);


    }
}