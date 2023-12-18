class shape
{
     void draw()
    {
        System.out.println("Can't say any shape");
    }
}

class square extends shape
{
    @Override   //Optional
    void draw()
    {
       super.draw();
       System.out.println("Square Shape");
    }
}

class RTP
{
    public static void main(String []args)
    {
        shape Obj=new square(); //shape-> refernece, Square-> Object

        Obj.draw();
    
    }
}