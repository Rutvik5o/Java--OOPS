//Implement Runnable

//Start method only on thread class not on that interface

class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("My Child Thread");
        }
    }
}

class TI1
{
    public static void main(String []args)
    {
        A Obj=new A();

        Thread TObj=new Thread(Obj);  // making object of thread using class object which passing on argument

        TObj.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}