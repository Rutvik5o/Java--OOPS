import java.util.Scanner;

interface client
{
           void input(); // public + Abstract
           void output(); // public + Abstract
}

class xyz implements client
{
    String name;
    double sal;

    public void input()  // by default it will take default access modifier
    {
        Scanner Obj=new Scanner(System.in);

        System.out.println("Enter Username-> ");
        name=Obj.nextLine();

        System.out.println("Enter Salary-> ");
        sal=Obj.nextDouble();

    }

    public void output()
    {
        System.out.println(name+ "=>" +sal);
    }

    public static void main(String []args)
    {
        client Obj1=new xyz(); //interface class references can given

        Obj1.input();
        Obj1.output();
    }
}