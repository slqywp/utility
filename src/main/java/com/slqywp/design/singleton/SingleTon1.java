package design.singleton;

public class SingleTon1
{
    private static SingleTon1 singleTon = new SingleTon1();

    private SingleTon1()
    {
    }

    public static SingleTon1 getInstance()
    {
        return singleTon;
    }
}
