public class this1 {

    void show()
    {
        System.out.println(this);
    }

    public static void main(String []args)
    {
        this1 Obj=new this1();
        System.out.println(Obj);
        Obj.show();
    }
    
}

//(1)-> this keyword refers to the current object inside a method or constructor.
