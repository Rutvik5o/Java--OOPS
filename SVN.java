
class SVN
{
    int a=10;

    static int b=20;

     
    public static void main(String []args)
    {
        SVN Obj1=new SVN();

        Obj1.disp();
        SVN.show();  //static access through class name
    }

    static void show()
    {
        System.out.println("show()"+ b);
    }

    void disp()
    {
        System.out.println("Disp()"+a+" "+b);
    }

}