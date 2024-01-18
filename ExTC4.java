//Finally=> finally block is a realtime block and the main purpose of finally block to handle the Resource.

class ExTC4
{
    public static void  main(String []args)
    {
         try
         {
            System.out.println("Learn it");

            int a=20,b=0,c; //b=4;

            c=a/b;

            System.out.println(c);

            System.out.println("Like it");
         }

         catch(ArithmeticException a) //NUllPointerException
         {
            System.out.println("Can't divided by zero");
         }

         finally
         {
            System.out.println("Welcome to finally block");
         }

         System.out.println("Main method ended");
    }
}