//ArithmeticException Error
class ExTC
{
    public static void main(String []args)
    {
        System.out.println("Main Method Start");

        int a=10,b=0,c;

        try
        {
            c=a/b;

            System.out.println(c);
        }

        catch(Exception e) //Exception superclass
        {
            System.out.println(e); // it will be print error and you can also write some text in that 
        }

        System.out.println("Main Method Ended");
    }
}