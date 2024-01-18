class ExTC3
{

    public static void main(String []args)
    {
    String str="123";

    try
    {
        int a=Integer.parseInt(str);

        System.out.println(a);
    }
    catch(NumberFormatException n)
    {
        System.out.println("String " + str+ " Can't be Converted to Integer");
    }

    System.out.println("Main Method Ended");
}
}
