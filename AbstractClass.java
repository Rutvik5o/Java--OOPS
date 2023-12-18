abstract class animal
{
    animal()
    {
        System.out.println("All Animals");
    }

    public abstract void sound();
}

class Dog extends animal
{
    Dog()
    {
        super();
    }

    public void sound()
    {
        System.out.println("Dog is barking");
    }
}

class Lion extends animal
{
    Lion()
    {
        super();
    }

    public void sound()
    {
        System.out.println("Lion is roar");
    }
}

class AbstractClass
{
    public static void main(String []args)
    {
        Dog d=new Dog();

        Lion L=new Lion();

        d.sound();

        L.sound();
    }
}



