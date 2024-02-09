//Thread ->
//Thread is a basic unit of cpu and it is well known for independent execution.

/*main methods job:
 * (1) Child Thread of that create object and start it
 * (2) main methods code execute
 */
//=> Extends Thread
class A extends Thread
{
    public void run() //try custom name of method then call 
    {
       try
       {
            for(int i=0;i<5;i++)
            {
                System.out.println("ABC");
                Thread.sleep(1000);
            }
       }
        catch(InterruptedException i) {}
    }
}

class TI
{
    public static void main(String []args) throws InterruptedException
    {
        A t=new A();

        t.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Xyz");
           Thread.sleep(1000);
        }
    }
}