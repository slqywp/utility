package design.singleton;

public class SingleTon2
{
    private static SingleTon2 singleTon = null;

    private SingleTon2()
    {
    }

    public static SingleTon2 getInstance()
    {
        if (singleTon == null)
        {
            synchronized (SingleTon2.class)
            {
                if (singleTon == null)
                {
                    singleTon = new SingleTon2();
                }
            }
        }
        return singleTon;
    }
}
