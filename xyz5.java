interface A
{
    public static void show()
    {
        System.out.println("Can't Override Interface static method");
    }
}

class Demo implements A
{
  /*   @Override

    public static void show()
    {
        System.out.println("Error");   gives error bxoz can't inherit
    } */
    
}


class xyz5
{
    public static void main(String []args)
    {
        A.show();

        Demo d=new Demo();
       // d.show();
    }
}