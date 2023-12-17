 class A {

    int roll,marks;

    String name;


    void input()
    {
        System.out.println("Enter Marks-> ");

    }
    
}

class SIMIN extends A
{
        void disp()
        {
            roll=1; name="xyz"; marks=100;

            System.out.println(roll+" "+name+" "+marks);
        }
    
        public static void main(String []args)
        {
            SIMIN Obj=new SIMIN();
            Obj.input();
            Obj.disp();
        }

    }