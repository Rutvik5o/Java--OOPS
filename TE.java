//Throw-> throw keyword is used to throw the user define or customized exception object to the 
//JVM explicity for the purpose we use throw keyword.

//Throws-> throw kyeword is used to throw the userdefine or customized Exception objec to the JVM Explicity
// for the purpose wer use throw keyword.


class TE
{
    void div(int a,int b) throws ArithmeticException //declar & bypass to colo
    {
        if(b==0)
        {
            throw new ArithmeticException();
            //Exception -> Creaet Exception Object : Explicity thrown
        }
        else
        {
            int c=a/b;

            System.out.println(c);
        }
    }

    public static void main(String []args)
    {
        TE one =new TE();
        try
        {
              one.div(20,0); 
        }
        catch(Exception e)
        {
            System.out.println("Out of two values in one of the value is 0");
        }
    }
}