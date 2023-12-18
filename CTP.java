import java.util.Scanner;

class CTP
{
    int add()
    {
        int a,b;

        System.out.println("Enter the value of a & b-> ");

        Scanner Obj=new Scanner(System.in);

        a=Obj.nextInt();

        b=Obj.nextInt();

        int c=a+b;

        return c;
    }

    void add(int x,int y)
    {
        double c;

        c=x+y;

        System.out.println(c);
    }

    public static void main(String []args)
    {
        CTP Obj1=new CTP();

       System.out.println(Obj1.add());

       Obj1.add(100,500);


    }


}

