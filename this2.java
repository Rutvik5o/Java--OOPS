 class one{

    int a;

    one(int a)
    {
        this.a=a;
    }

    void show()
    {
        System.out.println(a);
    }
}

class this2
{

    public static void main(String []args)
    {
        one Obj=new one(10);
        Obj.show();

    }
    
}

//(2)-> whenever the name of iinstance & local variables both are ame then our runtime
//      enviroment JVM gets confused that which one is local variable & which one is 
//      instance variable, to avoid ths problem we should use this keyword.
