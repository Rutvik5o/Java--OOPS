interface customer
{
    int amt=5; //public + static + final
    void purchase(); // public + abstract
}

class seller implements customer
{
    @Override
    public void purchase()
    {
        //amt=5 final can't change
        System.out.println("Xyz Need-> "+amt+"kg rice");
    }
}

class xyz1
{
    public static void main(String []args)
    {
        customer Obj=new seller();
        Obj.purchase();
    }
}