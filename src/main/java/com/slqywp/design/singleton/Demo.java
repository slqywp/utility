package design.singleton;

public class Demo
{
    public static void main(String[] args)
    {
        SingleTon1 test1, test2;
        test1 = SingleTon1.getInstance();
        test2 = SingleTon1.getInstance();

        SingleTon2 test3, test4;
        test3 = SingleTon2.getInstance();
        test4 = SingleTon2.getInstance();

        System.out.println(test1 == test2);
        System.out.println(test3 == test4);
    }
}
