//class and object

class calculator
{
    int i=10;
//    class has properties and methods
    float k = 20;

    public int add(int n1,int n2)
    {
        int r = n1+n2;
        return r;
    }
}

public class class_and_object
{
    public static void main(String args[])
    {
        int no1 = 1;
        int no2 = 2;

        calculator calc = new calculator(); // obj of type calculator: class ka naam ka : constructor
        int res= calc.add(no1,no2);

        System.out.println(res);

    }
}
