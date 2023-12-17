class A
{
    void input()
    {
        System.out.println("Enter Your Name-> ");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("My Name is Java");
    }
}

class C extends A
{
    void show()
    {
        System.out.println("My name is Compiler");
    }
}


class HIEINT 
{
    public static void main(String []args)
    {
        B Obj=new B();

        C Obj2=new C();

        Obj.input();

        Obj.show();

        Obj2.input();

        Obj2.show();
    }
}