public class Operators {

    public static void main(String[] args) {

//        int a = 7;
//        int b = 8;

//        boolean r1 = x < y && a < b;
//        System.out.println(r1);
        int x = 5;
        int y = 7;
        int z = 6;

//        if(x>y && x > z)
//            System.out.println("One Code"); // use curly bracket when we use more than 2 statements
//        else if(y>x && y>z)
//            System.out.println("y is greatest");
//        else {
//            System.out.println("Z is greatest");
//            System.out.println("THIRD error");

//        ternary operator:  one liner code
        int n = 5;
        int result = 0;
        int result2 = 0;

        if(n%2==0)
            result = 10;
        else
            result = 20;

        result2 = n%2==0 ? 10:20; //ternary operator

        System.out.println(result);
        System.out.println(result2);

        }
}



