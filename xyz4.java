interface A
{
    void show(); // public + abstract
}

interface B 
{
    void disp(); // public + abstract 
        
}
class xyz4 implements A,B
{
    public void show() //if we don't write public it will take default 
                       //and if default is small with compare than public.
    {
        System.out.println("Interface A");
    }

    public void disp()
    {
        System.out.println("Interface B");
    }

    public static void main(String []args)
    {
        xyz4 Obj=new xyz4();
        Obj.show(); Obj.disp();
    }
}