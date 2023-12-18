class a
{
    private int value; // data hiding

    public void setvalue(int x)
    {
        value=x;  
    }

    public int getvalue()
    {
        return ++value;
    }
}

class ENCAP
{
    public static void main(String []args)
    {
        a Obj=new a();
        Obj.setvalue(100);
        System.out.println(Obj.getvalue());
    }
}