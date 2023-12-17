class this3
{
    this3()
    {
        System.out.println("Default Constructor");

    }

    this3(int a)
    {
        this();
        System.out.println("Paramterized Constructor");
    }

    public static void main(String []args)
    {
        this3 Obj=new this3(100);
    }
}

//(3)-> It is also used when we want to call the default constructor of its own class.