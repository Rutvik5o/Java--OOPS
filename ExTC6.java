 class ExTC6 
 {
    public static void main(String []args)
    {
        try
        {
            int a=10,b=0,c; //b=2;

            c=a/b;

            System.out.println(c);

            int arr[]={10,20,30};

            System.out.println(arr[4]);  //arr[2];

            String str=null;         //"any strin"

            System.out.println(str.toUpperCase());
        }

        catch(ArrayIndexOutOfBoundsException o)
        {
                System.out.println("Array Exception");
        }

        catch(ArithmeticException n)
        {
            System.out.println("Arithmetic Exception");
        }

        catch(NumberFormatException e)
        {
            System.out.println("Number Exception");
        }

        catch(Exception x)
        {                                                        //Super Class     //Sub Class
            System.out.println("All type Exceptio Handled");  //Exception x-new NullPointerException();
        }
    }
}
