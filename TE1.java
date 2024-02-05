class TE1
{
    public static void main(String []args) throws InterruptedException //Main method Collar=> JVM
    {                                      /* convince to compiler to any Uninterrupted
                                               exception in any doubt contact to coller */
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);

        }
    }
}