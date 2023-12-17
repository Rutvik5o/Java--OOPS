import java.util.Scanner;
class A
{
    int a,b,c;

    void input()
    {
          System.out.println("Enter Two Number-> ");

          Scanner Obj=new Scanner(System.in);

          a=Obj.nextInt();

          b=Obj.nextInt();

          
    }

    void add()
    {
        c=a+b;

        System.out.println("Addition=> "+c);
    }

}


class B extends A
{
    void sub()
    {
        c=a-b;
        System.out.println("Subtraction=> "+c);
    }
}

class MULINT extends B
{
    void div()
    {
        c=a/b;
        System.out.println("Division=> "+c);
    }

    void rem()
    {
        c=a%b;

        System.out.println("Modulo=> "+c);
    }

    public static void main(String []args)
    {
        MULINT Obj=new MULINT();

        Obj.input();

        Obj.add();

        Obj.sub();

        Obj.div();

        Obj.rem();


    }
}

