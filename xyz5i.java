interface A 
{
        public static void show()
        {
            System.out.println("Can't Override Interface Static Methods");
        }

        void disp(); // abstract method  //if need that so to implement keyword on class
}

/* class Demo implements A  // if that not need then direct call through interface name
{
              
} */


class xyz5i
{
    public static void main(String []args)
    {
        A.show();

      //  Demo Obj=new Demo();
    // Obj.show();
    }
}