public class StaticE {

    public static void main(String []args)
    {
        StaticE Obj=new StaticE();


    }

    StaticE()
    {
        System.out.println("Constructor");

    }

    {
        System.out.println("Instance Block");
    }

    static
    {
        System.out.println("Static Block");
    }
    
}
