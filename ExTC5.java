class ExTC5
{
    public static void main(String []args)
    {
        try
        {
            int a=10,b=0,c; //  b=2;

            c=a/b;

            System.out.println(c);
        }

        catch(ArithmeticException u)
        {
            System.out.println("Can't Divided by Zero");
        }

        try
        {
            int a[]={10,20,30,40};
            System.out.println(a[6]); //a[2];
        }

        catch(ArrayIndexOutOfBoundsException s)
        {
            System.out.println("Beyound The Array List");
        }

    }
}