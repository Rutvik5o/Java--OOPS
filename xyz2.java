interface client
{
    void webdesign();
    void webdevelop();
}

abstract class MahindraTech implements client
{
    @Override
    public void webdesign()  //must be mention public otherwise it will take default
    {
        System.out.println("Green,top menu,three dot menu");
    }
}

class TataTech extends MahindraTech
{
    @Override
    public void webdevelop()
    {
        System.out.println("Html,CSS,JavaScript");
    }
}

class xyz2
{
    public static void main(String []args)
    {
        MahindraTech Obj=new TataTech();

        Obj.webdesign();
        Obj.webdevelop();
    }
}