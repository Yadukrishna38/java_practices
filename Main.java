
class casting
{

    public static void main(String args[])
    {
//        byte range is 128 to 127
        int a = 12;
        int e = 257; // beyond the range so it will do Modular % and ll provide the remainder
        byte k = (byte)a; // casting
        byte q = (byte)e;

        System.out.println(k);
        System.out.println(q); // this will give us the modular divide by the range and remainder..

        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);
//        type promotion
        byte z = 10;
        byte x = 20;
        int result = z * x; // java auto promotes to INT - even though it exceed the range
        System.out.println(result);
        System.out.println();

        int result1 = x++; // fetch the value and then increment
        int result2 = ++x; // increment and then fetch the value
        System.out.println(result1);
        System.out.println(result2);

    }
}









