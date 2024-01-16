//NullPointerException

class ExTC2
{
    public static void main(String []args)
    {
        String str=null; //You can use null as value

        try
        {
          System.out.println(str.toUpperCase());
        }

        catch(NullPointerException n) //Only Detect null pointer exception
        {
           System.out.println("Null can't be created");
        }
        
    }
}